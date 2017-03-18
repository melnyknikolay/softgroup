package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class MessagesReadConfirmationRequest implements RequestData {
    private static final long serialVersionUID = -646632386542250256L;

    private Integer conversationId;
    private List<Integer> messagesIds;

    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public List<Integer> getMessagesIds() {
        return messagesIds;
    }

    public void setMessagesIds(List<Integer> messagesIds) {
        this.messagesIds = messagesIds;
    }
}
