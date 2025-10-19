package com.hackhud.githubactivity.entity.payloads;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeleteEventPayload {

    @SerializedName("ref")
    private String ref;

    @SerializedName("ref_type")
    private String refType;

    @SerializedName("full_ref")
    private String fullRef;

    @SerializedName("pusher_type")
    private String pusherType;

}
