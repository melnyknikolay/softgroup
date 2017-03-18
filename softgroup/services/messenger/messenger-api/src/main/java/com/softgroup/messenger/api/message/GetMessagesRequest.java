package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.messenger.api.dto.RequestCursor;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetMessagesRequest implements RequestData {
    private static final long serialVersionUID = 6429785462395127153L;

    private Integer conversation_id;
    private RequestCursor requestCursor;

    public Integer getConversation_id() {
        return conversation_id;
    }

    public void setConversation_id(Integer conversation_id) {
        this.conversation_id = conversation_id;
    }

    public RequestCursor getRequestCursor() {
        return requestCursor;
    }

    public void setRequestCursor(RequestCursor requestCursor) {
        this.requestCursor = requestCursor;
    }
}
