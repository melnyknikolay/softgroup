package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.ProtocolUtils;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.SetProfileSettingsRequest;
import com.softgroup.profile.api.message.SetProfileSettingsResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class SetProfileSettingsHandler <T extends SetProfileSettingsRequest, R extends SetProfileSettingsResponse> extends AbstractRequestHandler<T, R> implements ProfileRequestHandler {
    @Override
    public String getName() {
        return "set_profile_settings";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        return ProtocolUtils.errorResponse(msg, ResponseStatus.NOT_IMPLEMENTED);
    }
}
