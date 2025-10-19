package com.hackhud.githubactivity.entity.payloads;

import com.google.gson.annotations.SerializedName;
import com.hackhud.githubactivity.entity.Actor;
import com.hackhud.githubactivity.entity.Label;
import com.hackhud.githubactivity.entity.PullRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class PullRequestEventPayload {

    private String action;

    private Integer number;

    @SerializedName( "pull_request")
    private PullRequest pullRequest;

    private Actor assignee;

    private List<Actor> assignees;

    private Label label;

    private List<Label> labels;

}
