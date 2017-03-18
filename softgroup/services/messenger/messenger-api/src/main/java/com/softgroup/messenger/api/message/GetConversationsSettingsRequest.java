package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationsSettingsRequest implements RequestData {
    private static final long serialVersionUID = -5067703675663315210L;

    private List<Integer> conversationsIds;

    public List<Integer> getConversationsIds() {
        return conversationsIds;
    }

    public void setConversationsIds(List<Integer> conversationsIds) {
        this.conversationsIds = conversationsIds;
    }
}
