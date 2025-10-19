package com.hackhud.githubactivity.entity.enums;

import com.hackhud.githubactivity.entity.payloads.*;
import lombok.Getter;

@Getter
public enum EventType {

    COMMIT_COMMENT_EVENT("CommitCommentEvent", CommitCommentEventPayload.class),
    CREATE_EVENT("CreateEvent", CreateEventPayload.class),
    DELETE_EVENT("DeleteEvent", DeleteEventPayload.class),
    DISCUSSION_EVENT("DiscussionEvent", DiscussionEventPayload.class),
    FORK_EVENT("ForkEvent", ForkEventPayload.class),
    GOLLUM_EVENT("GollumEvent", GollumEventPayload.class),
    ISSUE_COMMENT_EVENT("IssueCommentEvent", IssueCommentEventPayload.class),
    ISSUES_EVENT("IssuesEvent", IssuesEventPayload.class),
    MEMBER_EVENT("MemberEvent", MemberEventPayload.class),
    PUBLIC_EVENT("PublicEvent", PublicEventPayload.class),
    PULL_REQUEST_EVENT("PullRequestEvent", PullRequestEventPayload.class),
    PULL_REQUEST_REVIEW_EVENT("PullRequestReviewEvent", PullRequestReviewPayload.class),
    PULL_REQUEST_REVIEW_COMMENT_EVENT("PullRequestReviewCommentEvent", PullRequestReviewCommentPayload.class),
    PUSH_EVENT("PushEvent", PushEventPayload.class),
    RELEASE_EVENT("ReleaseEvent", ReleaseEventPayload.class),
    WATCH_EVENT("WatchEvent", WatchEventPayload.class);

    private final String label;
    private final Class<?> payloadClass;

    EventType(String label, Class<?> payloadClass) {
        this.label = label;
        this.payloadClass = payloadClass;
    }

    public static EventType fromLabel(String label) {
        for (EventType type : values()) {
            if (type.label.equals(label)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown event type label: " + label);
    }
}
