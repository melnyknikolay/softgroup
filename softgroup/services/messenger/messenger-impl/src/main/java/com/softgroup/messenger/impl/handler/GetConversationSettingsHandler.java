package com.softgroup.messenger.impl.handler;

import com.softgroup.common.protocol.ProtocolBeansFactory;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.messenger.api.message.GetConversationSettingsRequest;
import com.softgroup.messenger.api.message.GetConversationSettingsResponse;
import com.softgroup.messenger.api.router.MessengerRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class GetConversationSettingsHandler <T extends GetConversationSettingsRequest, R extends GetConversationSettingsResponse> extends AbstractRequestHandler<T, R> implements MessengerRequestHandler {
    @Override
    public String getName() {
        return "get_conversation_settings";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        return ProtocolBeansFactory.getResponse(msg, null, ResponseStatus.NOT_IMPLEMENTED);
    }
}
