package com.hackhud.githubactivity.util;

import com.google.gson.*;
import com.hackhud.githubactivity.entity.Event;

import java.util.ArrayList;
import java.util.List;

public class GsonParser {

    public static List<Event> parseEvents(String json) {
        List<Event> createEvents = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Event.class, new EventDeserializer())
                .create();

        JsonArray array = JsonParser.parseString(json).getAsJsonArray();

        for (JsonElement element : array) {
            Event event = gson.fromJson(element, Event.class);
            createEvents.add(event);
        }
        return createEvents;
    }


}
