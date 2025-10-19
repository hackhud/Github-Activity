package com.hackhud.githubactivity.entity.payloads;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PushEventPayload {

    @SerializedName("repository_id")
    private Long repositoryId;

    @SerializedName("push_id")
    private Long pushId;

    @SerializedName("ref")
    private String ref;

    @SerializedName("head")
    private String head;

    @SerializedName("before")
    private String before;
}
