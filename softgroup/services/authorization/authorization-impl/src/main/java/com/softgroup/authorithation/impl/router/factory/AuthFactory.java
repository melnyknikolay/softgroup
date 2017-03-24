package com.softgroup.authorithation.impl.router.factory;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.api.router.factory.AuthorizationFactory;
import com.softgroup.common.router.api.factory.CommonHandlerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 09.03.17.
 */

@Component
public class AuthFactory extends CommonHandlerFactory<AuthorizationRequestHandler> implements AuthorizationFactory {
}
