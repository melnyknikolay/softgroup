package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationsDetailsRequest implements RequestData {
    private static final long serialVersionUID = 8621124122480963829L;

    private List<Integer> conversations_ids;

    public List<Integer> getConversations_ids() {
        return conversations_ids;
    }

    public void setConversations_ids(List<Integer> conversations_ids) {
        this.conversations_ids = conversations_ids;
    }
}