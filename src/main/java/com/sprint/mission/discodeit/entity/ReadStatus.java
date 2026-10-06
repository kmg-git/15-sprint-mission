package com.sprint.mission.discodeit.entity;

import lombok.Getter;

import java.time.Instant;
import java.util.UUID;
@Getter
public class ReadStatus extends BaseClass{
    private final UUID userId;
    private final UUID channelId;
    private Instant lastReadAt;

    public ReadStatus(UUID userId, UUID channelId,Instant lastReadAt) {
        super();
        this.userId = userId;
        this.channelId = channelId;
        this.lastReadAt=lastReadAt;
    }

    public void update(Instant lastReadAt){

        setUpdatedAt();
        this.lastReadAt=lastReadAt;
    }


}
