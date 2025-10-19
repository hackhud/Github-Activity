package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.DiscussionEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DiscussionEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        DiscussionEventPayload payload = (DiscussionEventPayload) event.getPayload();
        return event.getActor().getLogin() + " " + payload.getAction() + " discussion " + payload.getDiscussion().getId() + " at " + event.getCreatedAt();
    }
}
