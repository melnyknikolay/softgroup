package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.ConversationDetails;


/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationDetailsResponse implements ResponseData {
    private static final long serialVersionUID = -943820030004114610L;

    private ConversationDetails details;

    public ConversationDetails getDetails() {
        return details;
    }

    public void setDetails(ConversationDetails details) {
        this.details = details;
    }
}
