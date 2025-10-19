package com.hackhud.githubactivity.entity.payloads;

import com.hackhud.githubactivity.entity.Repo;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ForkEventPayload {

    private String action;

    private Repo forkee;

}
