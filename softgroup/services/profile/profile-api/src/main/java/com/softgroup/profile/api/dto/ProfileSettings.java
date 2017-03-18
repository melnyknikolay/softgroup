package com.softgroup.profile.api.dto;

import java.io.Serializable;

/**
 * Created by nikmlk on 24.02.17.
 */
public class ProfileSettings implements Serializable {
    private static final long serialVersionUID = 754302445583478755L;

    private String id;
    private String phoneNumber;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
