package com.softgroup.messenger.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class Conversation implements Serializable {
    private static final long serialVersionUID = -4265247275851292012L;

    private Integer type;
    private List<Integer> members_ids;
    private Integer uuid;
    private List<Message> messages;
    private Cursor cursor;
    private Integer total_unread;
    private Conversation_details details;
    private Conversation_settings settings;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Integer> getMembers_ids() {
        return members_ids;
    }

    public void setMembers_ids(List<Integer> members_ids) {
        this.members_ids = members_ids;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    public Integer getTotal_unread() {
        return total_unread;
    }

    public void setTotal_unread(Integer total_unread) {
        this.total_unread = total_unread;
    }

    public Conversation_details getDetails() {
        return details;
    }

    public void setDetails(Conversation_details details) {
        this.details = details;
    }

    public Conversation_settings getSettings() {
        return settings;
    }

    public void setSettings(Conversation_settings settings) {
        this.settings = settings;
    }
}
