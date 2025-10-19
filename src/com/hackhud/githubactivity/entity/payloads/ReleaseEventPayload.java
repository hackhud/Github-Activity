package com.hackhud.githubactivity.entity.payloads;

import com.hackhud.githubactivity.entity.Release;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReleaseEventPayload {

    private String action;

    private Release release;

}
