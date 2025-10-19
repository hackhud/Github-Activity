package com.hackhud.githubactivity.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Issue {

    private String url;

    private String repositoryUrl;

    private String labelsUrl;

    private String commentsUrl;

    private Long id;

    private Integer number;

    private String title;

    private Actor user;

    private String state;

}
