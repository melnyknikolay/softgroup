package com.softgroup.profile.api.dto;

import java.io.Serializable;

/**
 * Created by nikmlk on 24.02.17.
 */
public class Contact implements Serializable {
    private static final long serialVersionUID = -7440744313047286167L;

    private String[] phoneNumber;
    private String name;

    public String[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
