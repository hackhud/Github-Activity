package com.hackhud.githubactivity.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Actor {

    private long id;

    private String login;

    @SerializedName("display_login")
    private String displayLogin;

    @SerializedName("gravatar_id")
    private String gravatarId;

    private String url;

    @SerializedName("avatar_url")
    private String avatarUrl;

}
