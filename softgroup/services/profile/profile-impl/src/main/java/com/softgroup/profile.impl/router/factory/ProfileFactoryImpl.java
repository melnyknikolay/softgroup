package com.softgroup.profile.impl.router.factory;

import com.softgroup.common.router.api.factory.CommonHandlerFactory;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import com.softgroup.profile.api.router.factory.ProfileFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 09.03.17.
 */

@Component
public class ProfileFactoryImpl extends CommonHandlerFactory<ProfileRequestHandler> implements ProfileFactory {
}
