package com.softgroup.messenger.api.dto;

import java.io.Serializable;

/**
 * Created by nikmlk on 18.03.17.
 */
public class ConversationSyncDTO implements Serializable {
    private static final long serialVersionUID = -6198828582919019367L;

    private String id;
    private String lastMessageIndex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastMessageIndex() {
        return lastMessageIndex;
    }

    public void setLastMessageIndex(String lastMessageIndex) {
        this.lastMessageIndex = lastMessageIndex;
    }
}
