package com.hackhud.githubactivity.entity.payloads;

import com.hackhud.githubactivity.entity.Page;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class GollumEventPayload {

    List<Page> pages;

}
