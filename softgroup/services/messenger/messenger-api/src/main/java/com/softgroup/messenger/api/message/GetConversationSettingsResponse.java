package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Conversation_settings;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationSettingsResponse implements ResponseData {
    private static final long serialVersionUID = 5841296409708314807L;

    private Conversation_settings settings;

    public Conversation_settings getSettings() {
        return settings;
    }

    public void setSettings(Conversation_settings settings) {
        this.settings = settings;
    }
}
