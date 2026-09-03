package com.sprint.mission.discodeit.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.*;


public class Channel extends BaseClass {
    ///////////////////////////////////////////

    private String name;
    ///////////////////////////////////////////

    @JsonCreator
    public Channel(
            @JsonProperty("id") UUID id,
            @JsonProperty("createdAt") Long createdAt,
            @JsonProperty("updatedAt") Long updatedAt,
            @JsonProperty("name") String name
    ) {
        super(id, createdAt, updatedAt);
        this.name = name;
    }

    public Channel(String name) {
        super();
        this.name = name;
    }

    public void update(String name){
        this.name = name;
        setUpdatedAt();
    }

    public String getName() {
        return name;
    }







}
