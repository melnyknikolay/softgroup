package com.softgroup.messenger.impl.router;

import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.messenger.api.router.MessengerRouterHandler;
import com.softgroup.messenger.api.router.factory.MessengerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class MessageRouter<T extends MessengerFactory> extends AbstractRouterHandler<T> implements MessengerRouterHandler {

    @Override
    public String getName() {
        return "messenger";
    }

}
