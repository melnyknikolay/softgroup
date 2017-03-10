package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Conversation;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationsByIdsResponse implements ResponseData {
    private static final long serialVersionUID = -1397811269934808554L;

    private List<Conversation> conversations;

    public List<Conversation> getConversations() {
        return conversations;
    }

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
    }
}
