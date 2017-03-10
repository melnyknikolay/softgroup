package com.softgroup.messenger.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.messenger.api.message.GetConversationDetailsRequest;
import com.softgroup.messenger.api.message.GetConversationDetailsResponse;
import com.softgroup.messenger.api.router.MessengerRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class GetConversationDetailsHandler <T extends GetConversationDetailsRequest, R extends GetConversationDetailsResponse> extends AbstractRequestHandler<T, R> implements MessengerRequestHandler {
    @Override
    public String getName() {
        return "get_conversation_details";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        //ToDo
        return null;
    }
}
