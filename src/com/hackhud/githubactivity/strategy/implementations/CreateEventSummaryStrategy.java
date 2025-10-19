package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.CreateEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreateEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        CreateEventPayload payload = (CreateEventPayload) event.getPayload();
        return event.getActor().getLogin() + " created a repository at " + event.getCreatedAt();
    }

}
