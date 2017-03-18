package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Message;
import com.softgroup.messenger.api.dto.ResponseCursor;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetMessagesResponse implements ResponseData {
    private static final long serialVersionUID = 5887586929589615635L;

    private List<Message> messages;
    private Integer totalUnread;
    private ResponseCursor reresponseCursor;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Integer getTotalUnread() {
        return totalUnread;
    }

    public void setTotalUnread(Integer totalUnread) {
        this.totalUnread = totalUnread;
    }

    public ResponseCursor getReresponseCursor() {
        return reresponseCursor;
    }

    public void setReresponseCursor(ResponseCursor reresponseCursor) {
        this.reresponseCursor = reresponseCursor;
    }
}
