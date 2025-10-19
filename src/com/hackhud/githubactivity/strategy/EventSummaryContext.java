package com.hackhud.githubactivity.strategy;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.enums.EventType;
import com.hackhud.githubactivity.strategy.implementations.*;

import java.util.HashMap;
import java.util.Map;

public class EventSummaryContext {

    private final Map<String, EventSummaryStrategy> strategies = new HashMap<>();

    public EventSummaryContext() {
        registerStrategy(EventType.PUSH_EVENT.getLabel(), new PushEventSummaryStrategy());
        registerStrategy(EventType.CREATE_EVENT.getLabel(), new CreateEventSummaryStrategy());
        registerStrategy(EventType.DELETE_EVENT.getLabel(), new DeleteEventSummaryStrategy());
        registerStrategy(EventType.COMMIT_COMMENT_EVENT.getLabel(), new CommitCommentEventSummaryStrategy());
        registerStrategy(EventType.DISCUSSION_EVENT.getLabel(), new DiscussionEventSummaryStrategy());
        registerStrategy(EventType.FORK_EVENT.getLabel(), new ForkEventSummaryStrategy());
        registerStrategy(EventType.GOLLUM_EVENT.getLabel(), new GollumEventSummaryStrategy());
        registerStrategy(EventType.ISSUE_COMMENT_EVENT.getLabel(), new IssueCommentEventSummaryStrategy());
        registerStrategy(EventType.ISSUES_EVENT.getLabel(), new IssuesEventSummaryStrategy());
        registerStrategy(EventType.MEMBER_EVENT.getLabel(), new MemberEventSummaryStrategy());
        registerStrategy(EventType.PUBLIC_EVENT.getLabel(), new PublicEventSummaryStrategy());
        registerStrategy(EventType.PULL_REQUEST_EVENT.getLabel(), new PulRequestEventSummaryStrategy());
        registerStrategy(EventType.PULL_REQUEST_REVIEW_EVENT.getLabel(), new PullRequestReviewEventSummaryStrategy());
        registerStrategy(EventType.PULL_REQUEST_REVIEW_COMMENT_EVENT.getLabel(), new PullRequestReviewCommentEventSummaryStrategy());
        registerStrategy(EventType.RELEASE_EVENT.getLabel(), new ReleaseEventSummaryStrategy());
        registerStrategy(EventType.WATCH_EVENT.getLabel(), new WatchEventSummaryStrategy());
    }

    public void registerStrategy(String eventName, EventSummaryStrategy strategy) {
        strategies.put(eventName, strategy);
    }

    public String generateEventSummary(Event event) {
        EventSummaryStrategy strategy = strategies.get(event.getType().getLabel());

        if (strategy == null) {
            return event.getType().getLabel() + ": has no bound messages for this event.";
        }

        return strategy.getSummary(event);

    }
}
