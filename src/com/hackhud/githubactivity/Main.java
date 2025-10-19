package com.hackhud.githubactivity;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.service.GitHubEventService;
import com.hackhud.githubactivity.strategy.EventSummaryContext;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        GitHubEventService eventService = new GitHubEventService();
        List<Event> events = eventService.loadEvents();
        EventSummaryContext context = new EventSummaryContext();
        for (Event event : events) {
            System.out.println(context.generateEventSummary(event));
        }
    }
}
