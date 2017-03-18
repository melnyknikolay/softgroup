package com.softgroup.messenger.api.dto;

import com.softgroup.profile.api.dto.Profile;

import java.io.Serializable;

/**
 * Created by nikmlk on 24.02.17.
 */
public class ConversationDetails implements Serializable {
    private static final long serialVersionUID = 2271266425852569417L;

    private String id;
    private Profile[] members;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Profile[] getMembers() {
        return members;
    }

    public void setMembers(Profile[] members) {
        this.members = members;
    }
}
