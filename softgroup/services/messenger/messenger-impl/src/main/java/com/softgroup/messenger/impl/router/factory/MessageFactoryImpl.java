package com.softgroup.messenger.impl.router.factory;

import com.softgroup.common.router.api.factory.CommonHandlerFactory;
import com.softgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.messenger.api.router.factory.MessengerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 09.03.17.
 */

@Component
public class MessageFactoryImpl extends CommonHandlerFactory<MessengerRequestHandler> implements MessengerFactory {
}
