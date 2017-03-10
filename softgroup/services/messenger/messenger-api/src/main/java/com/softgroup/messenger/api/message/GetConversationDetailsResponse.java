package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Conversation_details;


/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationDetailsResponse implements ResponseData {
    private static final long serialVersionUID = -943820030004114610L;

    private Conversation_details details;

    public Conversation_details getDetails() {
        return details;
    }

    public void setDetails(Conversation_details details) {
        this.details = details;
    }
}
