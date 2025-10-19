package com.hackhud.githubactivity.entity.payloads;

import com.google.gson.annotations.SerializedName;
import com.hackhud.githubactivity.entity.Comment;
import com.hackhud.githubactivity.entity.PullRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PullRequestReviewCommentPayload {

    private String action;

    private Comment comment;

    @SerializedName("pull_request")
    private PullRequest pullRequest;

}
