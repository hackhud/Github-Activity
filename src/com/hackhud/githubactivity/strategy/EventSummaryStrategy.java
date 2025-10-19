package com.hackhud.githubactivity.strategy;

import com.hackhud.githubactivity.entity.Event;

public interface EventSummaryStrategy {

    String getSummary(Event event);

}
