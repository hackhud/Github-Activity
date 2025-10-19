package com.hackhud.githubactivity.entity.payloads;

import com.hackhud.githubactivity.entity.Discussion;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DiscussionEventPayload {

    private String action;

    private Discussion discussion;

}
