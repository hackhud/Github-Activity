package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.ReleaseEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ReleaseEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        ReleaseEventPayload payload = (ReleaseEventPayload) event.getPayload();
        return event.getActor().getLogin() + " released " + payload.getRelease().getName() + " at " + event.getCreatedAt();
    }

}
