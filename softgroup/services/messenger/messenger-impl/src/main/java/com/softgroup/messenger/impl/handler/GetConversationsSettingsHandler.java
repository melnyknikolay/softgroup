package com.softgroup.messenger.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.messenger.api.message.GetConversationsSettingsRequest;
import com.softgroup.messenger.api.message.GetConversationsSettingsResponse;
import com.softgroup.messenger.api.router.MessengerRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class GetConversationsSettingsHandler <T extends GetConversationsSettingsRequest, R extends GetConversationsSettingsResponse> extends AbstractRequestHandler<T, R> implements MessengerRequestHandler {
    @Override
    public String getName() {
        return "get_conversations_settings";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        //ToDo
        return null;
    }
}
