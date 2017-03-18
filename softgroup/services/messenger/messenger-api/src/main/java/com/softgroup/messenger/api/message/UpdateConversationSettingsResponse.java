package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.ConversationSettings;

/**
 * Created by nikmlk on 24.02.17.
 */
public class UpdateConversationSettingsResponse implements ResponseData {
    private static final long serialVersionUID = -559718565289732563L;

    private ConversationSettings settings;

    public ConversationSettings getSettings() {
        return settings;
    }

    public void setSettings(ConversationSettings settings) {
        this.settings = settings;
    }
}
