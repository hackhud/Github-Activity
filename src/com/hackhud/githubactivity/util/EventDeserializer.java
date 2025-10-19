package com.hackhud.githubactivity.util;

import com.google.gson.*;
import com.hackhud.githubactivity.entity.*;
import com.hackhud.githubactivity.entity.enums.EventType;

import java.lang.reflect.Type;

public class EventDeserializer implements JsonDeserializer<Event> {

    @Override
    public Event deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();

        String id = obj.get("id").getAsString();
        String typeStr = obj.get("type").getAsString();

        EventType eventType = EventType.fromLabel(typeStr);

        Actor actor = context.deserialize(obj.get("actor"), Actor.class);
        Repo repo = context.deserialize(obj.get("repo"), Repo.class);
        boolean isPublic = obj.get("public").getAsBoolean();
        String createdAt = obj.get("created_at").getAsString();

        Class<?> payloadClass = eventType.getPayloadClass();

        Object payload;
        if (payloadClass != null) {
            payload = context.deserialize(obj.get("payload"), payloadClass);
        } else {
            payload = context.deserialize(obj.get("payload"), JsonObject.class);
        }

        Event event = new Event();
        event.setId(id);
        event.setType(eventType);
        event.setActor(actor);
        event.setRepo(repo);
        event.setPublic(isPublic);
        event.setCreatedAt(createdAt);
        event.setPayload(payload);

        return event;
    }

}
