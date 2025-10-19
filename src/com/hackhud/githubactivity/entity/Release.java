package com.hackhud.githubactivity.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Release {

    private Long id;

    private String tagName;

    private String name;

    private Boolean draft;

    private Boolean prerelease;

    private String createdAt;

    private String publishedAt;

    private Actor author;

    private String body;

    private String htmlUrl;

}
