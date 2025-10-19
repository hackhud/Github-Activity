package com.hackhud.githubactivity.entity.payloads;

import com.google.gson.annotations.SerializedName;
import com.hackhud.githubactivity.entity.PullRequest;
import com.hackhud.githubactivity.entity.PullRequestReview;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PullRequestReviewPayload {

    private String action;

    @SerializedName("pull_request")
    private PullRequest pullRequest;

    private PullRequestReview review;
}
