package com.softgroup.messenger.api.message;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetConversationsRequest implements RequestData {
    private static final long serialVersionUID = 6607901114661440938L;

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
