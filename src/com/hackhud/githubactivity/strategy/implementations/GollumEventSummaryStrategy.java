package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.GollumEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GollumEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        GollumEventPayload payload = (GollumEventPayload) event.getPayload();
        return event.getActor().getLogin() + " created " + payload.getPages().size() + " pages at " + event.getCreatedAt();
    }

}
