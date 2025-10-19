package com.hackhud.githubactivity.entity.payloads;

import com.hackhud.githubactivity.entity.Actor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberEventPayload {

    private String action;
    private Actor member;

}
