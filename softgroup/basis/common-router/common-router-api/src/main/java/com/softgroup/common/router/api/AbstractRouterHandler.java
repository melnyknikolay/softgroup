package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.factory.Factory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRouterHandler<T extends Factory> implements RouterHandler {

    @Autowired
    T factory;

    @Override
    public Response<?> handle(Request<?> msg) throws ClassNotFoundException {
        return factory.getHandler(msg).handle(msg);
    }
}
