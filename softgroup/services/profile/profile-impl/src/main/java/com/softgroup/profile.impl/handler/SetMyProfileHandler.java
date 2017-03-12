package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.ProtocolBeansFactory;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.SetMyProfileRequest;
import com.softgroup.profile.api.message.SetMyProfileResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class SetMyProfileHandler <T extends SetMyProfileRequest, R extends SetMyProfileResponse> extends AbstractRequestHandler<T, R> implements ProfileRequestHandler {
    @Override
    public String getName() {
        return "set_my_profile";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        return ProtocolBeansFactory.getResponse(msg, null, ResponseStatus.NOT_IMPLEMENTED);
    }
}
