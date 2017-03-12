package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.SmsConfirmRequest;
import com.softgroup.authorization.api.message.SmsConfirmResponse;
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
public class SmsConfirmHandler extends AbstractRequestHandler<SmsConfirmRequest, SmsConfirmResponse> implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "sms_confirm";
    }

    @Override
    protected Response<SmsConfirmRequest> doHandle(Request<SmsConfirmResponse> msg) {
        return ProtocolUtils.getResponse(msg, ResponseStatus.NOT_IMPLEMENTED);
    }
}
