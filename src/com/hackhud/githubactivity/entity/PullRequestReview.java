package com.hackhud.githubactivity.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PullRequestReview {

    private Long id;

    private Actor user;

    private String body;

    private String state;

    @SerializedName("submitted_at")
    private String submittedAt;

    @SerializedName("commit_id")
    private String commitId;
}
