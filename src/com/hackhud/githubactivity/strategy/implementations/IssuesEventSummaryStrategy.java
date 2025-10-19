package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.IssuesEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IssuesEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        IssuesEventPayload payload = (IssuesEventPayload) event.getPayload();
        return event.getActor().getLogin() + " " + payload.getAction() + " issue " + payload.getIssue().getId() + " at " + event.getCreatedAt();
    }

}
