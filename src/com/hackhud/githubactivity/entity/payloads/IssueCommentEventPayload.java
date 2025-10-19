package com.hackhud.githubactivity.entity.payloads;

import com.hackhud.githubactivity.entity.Issue;
import com.hackhud.githubactivity.entity.IssueComment;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class IssueCommentEventPayload {

    private String action;

    private Issue issue;

    private IssueComment comment;

}
