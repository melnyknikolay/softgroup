package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Conversation_details;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationsDetailsResponse implements ResponseData {
    private static final long serialVersionUID = -6430192539856852491L;

    private List<Conversation_details> conversations_details;

    public List<Conversation_details> getConversations_details() {
        return conversations_details;
    }

    public void setConversations_details(List<Conversation_details> conversations_details) {
        this.conversations_details = conversations_details;
    }
}
