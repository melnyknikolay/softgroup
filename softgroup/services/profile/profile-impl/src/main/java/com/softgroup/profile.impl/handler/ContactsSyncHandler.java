package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.ContactsSyncRequest;
import com.softgroup.profile.api.message.ContactsSyncResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class ContactsSyncHandler<T extends ContactsSyncRequest, R extends ContactsSyncResponse> extends AbstractRequestHandler<T, R> implements ProfileRequestHandler {
    @Override
    public String getName() {
        return "contacts_sync";
    }


    @Override
    protected Response<R> doHandle(Request<T> msg) {
        //ToDo
        return null;
    }
}
