package com.softgroup.profile.api.dto;

import java.io.Serializable;

/**
 * Created by nikmlk on 18.03.17.
 */
public class ProfileSyncDTO implements Serializable {
    private static final long serialVersionUID = 2289946179981550831L;

    private String id;
    private Long lastModified;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }
}
