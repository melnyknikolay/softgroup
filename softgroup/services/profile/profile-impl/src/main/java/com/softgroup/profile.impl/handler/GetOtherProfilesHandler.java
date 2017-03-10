package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.GetOtherProfilesRequest;
import com.softgroup.profile.api.message.GetOtherProfilesResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class GetOtherProfilesHandler <T extends GetOtherProfilesRequest, R extends GetOtherProfilesResponse> extends AbstractRequestHandler<T, R> implements ProfileRequestHandler {
    @Override
    public String getName() {
        return "get_other_profiles";
    }

    @Override
    protected Response<R> doHandle(Request<T> msg) {
        //ToDo
        return null;
    }
}
