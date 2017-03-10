package com.softgroup.messenger.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.messenger.api.message.GetConversationsRequest;
import com.softgroup.messenger.api.message.GetConversationsResponse;
import com.softgroup.messenger.api.router.MessengerRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class GetConversationsHandler<T extends GetConversationsRequest, R extends GetConversationsResponse> extends AbstractRequestHandler<T, R> implements MessengerRequestHandler {
    @Override
    public String getName() {
        return "get_conversations";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        //ToDo
        return null;
    }
}
