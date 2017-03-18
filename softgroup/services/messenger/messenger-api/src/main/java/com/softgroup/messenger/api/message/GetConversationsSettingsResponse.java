package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.ConversationSettings;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationsSettingsResponse implements ResponseData {
    private static final long serialVersionUID = 3868132571019599769L;

    private List<ConversationSettings> conversations_settings;

    public List<ConversationSettings> getConversations_settings() {
        return conversations_settings;
    }

    public void setConversations_settings(List<ConversationSettings> conversations_settings) {
        this.conversations_settings = conversations_settings;
    }
}
