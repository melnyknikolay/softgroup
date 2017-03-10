package com.softgroup.profile.impl.router.factory;

import com.softgroup.common.router.api.factory.HandlerFactory;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import com.softgroup.profile.api.router.factory.ProfileFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 09.03.17.
 */

@Component
public class ProfileFactoryImpl<T extends ProfileRequestHandler> extends HandlerFactory<T> implements ProfileFactory<T> {
}
