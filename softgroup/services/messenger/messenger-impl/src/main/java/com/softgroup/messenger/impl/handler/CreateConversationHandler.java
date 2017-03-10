package com.softgroup.messenger.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.messenger.api.message.CreateConversationRequest;
import com.softgroup.messenger.api.message.CreateConversationResponse;
import com.softgroup.messenger.api.router.MessengerRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class CreateConversationHandler <T extends CreateConversationRequest, R extends CreateConversationResponse> extends AbstractRequestHandler<T, R> implements MessengerRequestHandler {
    @Override
    public String getName() {
        return "create_conversation";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        //ToDo
        return null;
    }
}
