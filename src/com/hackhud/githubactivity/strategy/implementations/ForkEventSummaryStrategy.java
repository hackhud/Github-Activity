package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.ForkEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ForkEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        ForkEventPayload payload = (ForkEventPayload) event.getPayload();
        return event.getActor().getLogin() + " forked " + payload.getForkee().getName() + " at " + event.getCreatedAt();
    }
}
