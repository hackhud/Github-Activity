package com.hackhud.githubactivity.entity.payloads;

import com.hackhud.githubactivity.entity.Actor;
import com.hackhud.githubactivity.entity.Issue;
import com.hackhud.githubactivity.entity.Label;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class IssuesEventPayload {

    private String action;

    private Issue issue;

    private Actor assignee;

    private List<Actor> assignees;

    private List<Label> labels;
}
