package com.hackhud.githubactivity.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Discussion {

    private long id;

    private String title;

    private String body;

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("author")
    private Actor author;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

}
