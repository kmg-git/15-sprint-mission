package com.sprint.mission.discodeit.entity;

import lombok.Getter;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

@Getter
public class UserStatus extends BaseClass {
    private final UUID userId;
    private Instant lastActiveAt;

    public UserStatus(UUID userId, Instant lastActiveAt){
        super();
        this.userId=userId;
        this.lastActiveAt=lastActiveAt;

    }

    public void update(Instant lastActiveAt){

        setUpdatedAt();
        this.lastActiveAt=lastActiveAt;
    }

    public boolean isOnline(){
        return Duration.between(getLastActiveAt(), Instant.now()).toMinutes() < 5;
    }

}
