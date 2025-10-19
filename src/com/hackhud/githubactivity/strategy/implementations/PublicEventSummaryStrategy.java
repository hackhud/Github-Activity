package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.PublicEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PublicEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        PublicEventPayload publicEventPayload = (PublicEventPayload) event.getPayload();
        return event.getActor().getLogin() + " made repository " + event.getRepo().getName() + " public";
    }
}
