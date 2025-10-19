package com.hackhud.githubactivity.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Page {

    @SerializedName("page_name")
    private String pageName;

    private String title;

    private String summary;

    private String action;

    private String sha;

    @SerializedName("html_url")
    private String htmlUrl;

}
