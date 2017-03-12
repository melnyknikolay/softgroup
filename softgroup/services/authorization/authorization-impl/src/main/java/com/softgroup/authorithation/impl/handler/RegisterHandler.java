package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.ProtocolUtils;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class RegisterHandler extends AbstractRequestHandler<RegisterRequest, RegisterResponse> implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "register";
    }

    @Override
    protected Response<RegisterResponse> doHandle(Request<RegisterRequest> msg) {
        return ProtocolUtils.errorResponse(msg, ResponseStatus.NOT_IMPLEMENTED);
    }
}
