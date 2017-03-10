package com.softgroup.messenger.impl.router.factory;

import com.softgroup.common.router.api.factory.HandlerFactory;
import com.softgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.messenger.api.router.factory.MessengerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 09.03.17.
 */

@Component
public class MessageFactoryImpl<T extends MessengerRequestHandler> extends HandlerFactory<T> implements MessengerFactory<T> {
}
