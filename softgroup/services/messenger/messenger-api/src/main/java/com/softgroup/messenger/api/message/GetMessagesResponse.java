package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Cursor;
import com.softgroup.messenger.api.dto.Message;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetMessagesResponse implements ResponseData {
    private static final long serialVersionUID = 5887586929589615635L;

    private List<Message> messages;
    private Integer total_unread;
    private Cursor cursor;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Integer getTotal_unread() {
        return total_unread;
    }

    public void setTotal_unread(Integer total_unread) {
        this.total_unread = total_unread;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }
}
