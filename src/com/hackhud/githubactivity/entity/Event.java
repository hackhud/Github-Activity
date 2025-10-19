package com.hackhud.githubactivity.entity;

import com.google.gson.annotations.SerializedName;
import com.hackhud.githubactivity.entity.enums.EventType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Event {

    private String id;

    private EventType type;

    private Actor actor;

    private Repo repo;

    private Object payload;

    @SerializedName("public")
    private boolean isPublic;

    @SerializedName("created_at")
    private String createdAt;

}
