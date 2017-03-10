package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;

/**
 * Created by nikmlk on 26.02.17.
 */

public class RouterFactory<T extends Handler> extends AbstractFactory<T> implements Factory<T> {

    @Override
    protected String getKey(Request<?> msg) {
        return msg.getHeader().getType();
    }
}
