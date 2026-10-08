package com.sprint.mission.discodeit.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.UUID;

//계정,비번,닉,등급?

@Table(name = "users")
@Entity
@Getter
public class User extends BaseUpdatableEntity {

    private String email;
    private String password;
    private String username;

    private BinaryContent profile;


    private UserStatus status;


    protected User(){}

    public User(String email, String password, String username, UUID profileId) {
        super();
        this.email=email;
        this.password=password;
        this.username = username;
        this.profileId=profileId;
    }



    public void update(String email, String password, String name , UUID profileId) {

        this.email=email;
        this.password=password;
        this.username =name;
        this.profileId=profileId;
    }


}

