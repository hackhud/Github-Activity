package com.hackhud.githubactivity.strategy.implementations;

import com.hackhud.githubactivity.entity.Event;
import com.hackhud.githubactivity.entity.payloads.MemberEventPayload;
import com.hackhud.githubactivity.strategy.EventSummaryStrategy;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MemberEventSummaryStrategy implements EventSummaryStrategy {

    @Override
    public String getSummary(Event event) {
        MemberEventPayload payload = (MemberEventPayload) event.getPayload();
        return event.getActor().getLogin() + " " + payload.getAction() + " " + payload.getMember().getLogin() + " at " + event.getCreatedAt();
    }

}
