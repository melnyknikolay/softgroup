package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;

/**
 * Created by nikmlk on 26.02.17.
 */

public class CommonHandlerFactory<T extends Handler> extends AbstractHandlerFactory<T> implements HandlerFactory<T> {

    @Override
    protected String getKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }


}
