package com.softgroup.common.router.api;

import com.softgroup.common.protocol.ProtocolUtils;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.factory.HandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRouterHandler<T extends HandlerFactory> implements RouterHandler {

    @Autowired
    T factory;

    @Override
    public Response<?> handle(Request<?> msg) {
        try {
            Handler handler = factory.getHandler(msg);
            if (handler != null){
                return handler.handle(msg);
            }
            return ProtocolUtils.errorResponse(msg, ResponseStatus.NOT_FOUND);
        }catch (Exception e){
            return ProtocolUtils.errorResponse(msg, ResponseStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
