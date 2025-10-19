package com.hackhud.githubactivity.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class IssueComment {

    private String url;

    private Long id;

    private String body;

    private Actor user;

    private String createdAt;

    private String updatedAt;

    private String htmlUrl;

}
