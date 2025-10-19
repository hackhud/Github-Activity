package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.PullRequestReviewCommentPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PullRequestReviewCommentEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        PullRequestReviewCommentPayload payload = (PullRequestReviewCommentPayload) event.getPayload();
        return event.getActor().getLogin() + " " +
                payload.getAction() +
                " a pull request review comment on PR #" +
                (payload.getPullRequest() != null ? payload.getPullRequest().getNumber() : "unknown") +
                ": " + (payload.getComment() != null ? payload.getComment().getBody() : "");

    }

}
