package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Conversation_settings;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationsSettingsResponse implements ResponseData {
    private static final long serialVersionUID = 3868132571019599769L;

    private List<Conversation_settings> conversations_settings;

    public List<Conversation_settings> getConversations_settings() {
        return conversations_settings;
    }

    public void setConversations_settings(List<Conversation_settings> conversations_settings) {
        this.conversations_settings = conversations_settings;
    }
}
