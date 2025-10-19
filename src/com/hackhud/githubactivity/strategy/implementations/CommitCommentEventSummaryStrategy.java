package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.CommitCommentEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CommitCommentEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        CommitCommentEventPayload payload = (CommitCommentEventPayload) event.getPayload();
        return event.getActor().getLogin() + " commented on commit " + payload.getComment().getId() + " at " + event.getCreatedAt();
    }

}
