package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class MessagesReadConfirmationRequest implements RequestData {
    private static final long serialVersionUID = -646632386542250256L;

    private Integer conversation_id;
    private List<Integer> messages_ids;

    public Integer getConversation_id() {
        return conversation_id;
    }

    public void setConversation_id(Integer conversation_id) {
        this.conversation_id = conversation_id;
    }

    public List<Integer> getMessages_ids() {
        return messages_ids;
    }

    public void setMessages_ids(List<Integer> messages_ids) {
        this.messages_ids = messages_ids;
    }
}
