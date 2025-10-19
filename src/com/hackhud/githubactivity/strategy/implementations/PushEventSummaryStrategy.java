package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.PushEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PushEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        PushEventPayload payload = (PushEventPayload) event.getPayload();
        return event.getActor().getLogin() + " pushed to " + event.getRepo().getName() + " at " + event.getCreatedAt();
    }
}
