package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;

/**
 * Created by nikmlk on 26.02.17.
 */
public interface HandlerFactory<T extends Handler> {
    T getHandler(Request<?> msg);
}
