package com.softgroup.profile.api.dto;

import java.io.Serializable;

/**
 * Created by nikmlk on 24.02.17.
 */
public class ProfileStatus implements Serializable {
    private static final long serialVersionUID = 6503579905155908280L;

    private String id;
    private Boolean isOnline;
    private Long lastTimeOnline;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Long getLastTimeOnline() {
        return lastTimeOnline;
    }

    public void setLastTimeOnline(Long lastTimeOnline) {
        this.lastTimeOnline = lastTimeOnline;
    }
}
