package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by nikmlk on 24.02.17.
 */
public class IsTypingInChatRequest implements RequestData {
    private static final long serialVersionUID = 3783889734144035822L;

    private Integer conversation_id;

    public Integer getConversation_id() {
        return conversation_id;
    }

    public void setConversation_id(Integer conversation_id) {
        this.conversation_id = conversation_id;
    }
}
