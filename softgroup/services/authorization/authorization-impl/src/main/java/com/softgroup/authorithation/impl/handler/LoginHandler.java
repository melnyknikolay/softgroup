package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
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
public class LoginHandler extends AbstractRequestHandler<LoginRequest, LoginResponse> implements AuthorizationRequestHandler {
    @Override
    public String getName() {
        return "login";
    }

    @Override
    protected Response<LoginResponse> doHandle(Request<LoginRequest> msg) {
        return ProtocolUtils.errorResponse(msg, ResponseStatus.NOT_IMPLEMENTED);
    }
}
