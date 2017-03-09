package com.softgroup.authorization.api.router.factory;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.router.api.factory.Factory;

/**
 * Created by nikmlk on 09.03.17.
 */
public interface AuthorizationFactory<T extends AuthorizationRequestHandler> extends Factory<T> {
}
