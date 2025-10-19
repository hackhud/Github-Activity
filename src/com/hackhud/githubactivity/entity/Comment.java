package com.hackhud.githubactivity.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Comment {

    @SerializedName("html_url")
    private String htmlUrl;

    @SerializedName("url")
    private String apiUrl;

    @SerializedName("id")
    private long id;

    @SerializedName("node_id")
    private String nodeId;

    @SerializedName("body")
    private String body;

    @SerializedName("path")
    private String path;

    @SerializedName("position")
    private Integer position;

    @SerializedName("line")
    private Integer line;

    @SerializedName("commit_id")
    private String commitId;

    @SerializedName("user")
    private GitHubUser user;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("author_association")
    private String authorAssociation;

}
