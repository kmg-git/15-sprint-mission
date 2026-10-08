package com.sprint.mission.discodeit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

@Table(name = "user_statuses")
@Entity
@Getter
public class UserStatus extends BaseUpdatableEntity {
    @OneToOne(fetch = FetchType.LAZY)
    private User user;
    

    private Instant lastActiveAt;

    protected UserStatus(){}

    public UserStatus(User user, Instant lastActiveAt){
        super();
        this.user=user;
        this.lastActiveAt=lastActiveAt;

    }

    public void update(Instant lastActiveAt){

        this.lastActiveAt=lastActiveAt;
    }

    public boolean isOnline(){
        return Duration.between(getLastActiveAt(), Instant.now()).toMinutes() < 5;
    }

}
