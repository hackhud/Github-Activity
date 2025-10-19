package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.IssueCommentEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IssueCommentEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        IssueCommentEventPayload payload = (IssueCommentEventPayload) event.getPayload();
        return event.getActor().getLogin() + " commented on issue " + payload.getIssue().getId() + " at " + event.getCreatedAt();
    }
}
