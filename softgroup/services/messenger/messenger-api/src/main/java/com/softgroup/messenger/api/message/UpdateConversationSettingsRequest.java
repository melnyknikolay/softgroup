package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.messenger.api.dto.ConversationSettings;

/**
 * Created by nikmlk on 24.02.17.
 */
public class UpdateConversationSettingsRequest implements RequestData {
    private static final long serialVersionUID = 9192314828053352547L;

    private ConversationSettings settings;

    public ConversationSettings getSettings() {
        return settings;
    }

    public void setSettings(ConversationSettings settings) {
        this.settings = settings;
    }
}
