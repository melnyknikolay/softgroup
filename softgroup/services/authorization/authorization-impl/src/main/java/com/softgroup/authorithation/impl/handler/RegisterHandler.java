package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class RegisterHandler <T extends RegisterRequest, R extends RegisterResponse> extends AbstractRequestHandler<T, R> implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "register";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        return ProtocolBeansFactory.getResponse(msg, null, ResponseStatus.NOT_IMPLEMENTED);
    }
}
