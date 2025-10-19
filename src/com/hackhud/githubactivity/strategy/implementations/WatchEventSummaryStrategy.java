package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.WatchEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;

public class WatchEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        WatchEventPayload payload = (WatchEventPayload) event.getPayload();
        return event.getActor().getLogin() + " " + payload.getAction() + " watching repository " + event.getRepo().getName() + " at " + event.getCreatedAt();
    }
}
