package com.hackhud.githubactivity.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class PullRequest {
    private Long id;

    private Integer number;

    private String state;

    private String title;

    private Actor user;

    private String body;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("closed_at")
    private String closedAt;

    @SerializedName("merged_at")
    private String mergedAt;

    @SerializedName("merge_commit_sha")
    private String mergeCommitSha;

    private Actor assignee;

    private List<Label> labels;
}
