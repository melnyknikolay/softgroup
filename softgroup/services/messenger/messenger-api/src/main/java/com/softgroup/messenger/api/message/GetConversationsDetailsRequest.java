package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationsDetailsRequest implements RequestData {
    private static final long serialVersionUID = 8621124122480963829L;

    private List<Integer> conversationsIds;

    public List<Integer> getConversationsIds() {
        return conversationsIds;
    }

    public void setConversationsIds(List<Integer> conversationsIds) {
        this.conversationsIds = conversationsIds;
    }
}
