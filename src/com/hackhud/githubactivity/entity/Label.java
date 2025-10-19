package com.hackhud.githubactivity.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Label {

    private Long id;

    private String nodeId;

    private String url;

    private String name;

    private String color;

    private Boolean defaultLabel;

}
