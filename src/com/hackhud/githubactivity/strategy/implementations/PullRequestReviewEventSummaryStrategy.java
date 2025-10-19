package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.PullRequestReviewPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PullRequestReviewEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        PullRequestReviewPayload payload = (PullRequestReviewPayload) event.getPayload();
        String reviewer = payload.getReview() != null && payload.getReview().getUser() != null
                ? payload.getReview().getUser().getLogin() : "Someone";
        String action = payload.getAction() != null ? payload.getAction() : "performed";
        String body = payload.getReview() != null && payload.getReview().getBody() != null && !payload.getReview().getBody().isEmpty()
                ? ": " + payload.getReview().getBody() : "";

        return event.getActor().getLogin() + " " + action + " pull request review by " + reviewer + body + " at " + event.getCreatedAt();
    }
}
