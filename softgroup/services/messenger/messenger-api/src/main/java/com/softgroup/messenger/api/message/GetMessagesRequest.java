package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.messenger.api.dto.RequestCursor;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetMessagesRequest implements RequestData {
    private static final long serialVersionUID = 6429785462395127153L;

    private Integer conversationId;
    private RequestCursor requestCursor;

    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public RequestCursor getRequestCursor() {
        return requestCursor;
    }

    public void setRequestCursor(RequestCursor requestCursor) {
        this.requestCursor = requestCursor;
    }
}
