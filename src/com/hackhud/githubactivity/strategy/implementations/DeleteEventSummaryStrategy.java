package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.DeleteEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DeleteEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        DeleteEventPayload payload = (DeleteEventPayload) event.getPayload();
        return event.getActor().getLogin() + " deleted " + payload.getRefType() + " " + payload.getRef() + " at " + event.getRepo().getName() + " at " + event.getCreatedAt();
    }
}
