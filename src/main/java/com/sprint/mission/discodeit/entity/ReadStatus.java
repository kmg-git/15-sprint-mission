package com.sprint.mission.discodeit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Table(name = "read_statuses")
@Entity
@Getter
public class ReadStatus extends BaseUpdatableEntity {


    private User user;
    private Channel channel;
    private Instant lastReadAt;

    protected ReadStatus(){

    }

    public ReadStatus(UUID userId, UUID channelId,Instant lastReadAt) {
        super();
        this.userId = userId;
        this.channelId = channelId;
        this.lastReadAt=lastReadAt;
    }

    public void update(Instant lastReadAt){
        this.lastReadAt=lastReadAt;
    }


}
