package com.softgroup.common.router.api;

import com.softgroup.common.protocol.ProtocolBeansFactory;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.factory.Factory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRouterHandler<T extends Factory> implements RouterHandler {

    @Autowired
    T factory;

    @Override
    public Response<?> handle(Request<?> msg) {
        try {
            return factory.getHandler(msg).handle(msg);
        }catch (NullPointerException e){
            return ProtocolBeansFactory.getResponse(msg, null, ResponseStatus.NOT_FOUND);
        }catch (Exception e){
            return ProtocolBeansFactory.getResponse(msg, null, ResponseStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
