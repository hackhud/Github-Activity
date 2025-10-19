package com.hackhud.githubactivity.service;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.util.GsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GitHubEventService {

    private static final String API_TEMPLATE = "https://api.github.com/users/%s/events";
    private static final boolean USE_LOCAL_EXAMPLE_JSON = false;

    public List<Event> loadEvents() throws IOException {
        String jsonResponse;
        if (USE_LOCAL_EXAMPLE_JSON) {
            jsonResponse = readJsonFromFile("example_api_input.json");
        } else {
            String username = readUsernameFromConsole();
            jsonResponse = fetchEventsFromApi(username);
        }
        return GsonParser.parseEvents(jsonResponse);
    }

    private String readUsernameFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter GitHub username: ");
        return reader.readLine();
    }

    private String fetchEventsFromApi(String username) throws IOException {
        String apiUrl = String.format(API_TEMPLATE, username);
        URL url = new URL(apiUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");

        int responseCode = httpURLConnection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
            throw new IOException("This GitHub username doesn't exist.");
        }
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new IOException("Error: got response code " + responseCode);
        }

        return getJsonFromConnection(httpURLConnection);
    }

    private String getJsonFromConnection(HttpURLConnection connection) throws IOException {
        StringBuilder response = new StringBuilder();
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }

    private String readJsonFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
