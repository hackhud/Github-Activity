package com.hackhud.githubactivity.entity.payloads;

import com.hackhud.githubactivity.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommitCommentEventPayload {

    private String action;

    private Comment comment;

}
