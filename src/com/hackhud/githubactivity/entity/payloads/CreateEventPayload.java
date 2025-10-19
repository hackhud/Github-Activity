package com.hackhud.githubactivity.entity.payloads;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateEventPayload {

    @SerializedName("ref")
    private String ref;

    @SerializedName("ref_type")
    private String refType;

    @SerializedName("full_ref")
    private String fullRef;

    @SerializedName("master_branch")
    private String masterBranch;

    @SerializedName("description")
    private String description;

    @SerializedName("pusher_type")
    private String pusherType;

}
