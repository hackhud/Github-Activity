package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.PullRequestEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PulRequestEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        PullRequestEventPayload payload = (PullRequestEventPayload) event.getPayload();
        return event.getActor().getLogin() + " " + payload.getAction() + " pull request " + payload.getNumber() + " at " + event.getCreatedAt();
    }

}
