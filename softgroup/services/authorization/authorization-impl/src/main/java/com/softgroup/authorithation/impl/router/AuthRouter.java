package com.softgroup.authorithation.impl.router;

import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.authorization.api.router.factory.AuthorizationFactory;
import com.softgroup.common.router.api.AbstractRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class AuthRouter<T extends AuthorizationFactory> extends AbstractRouterHandler<T> implements AuthorizationRouterHandler {

    @Override
    public String getName() {
        return "authorization";
    }

}
