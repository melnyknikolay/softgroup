package com.softgroup.profile.api.router.factory;

import com.softgroup.common.router.api.factory.Factory;
import com.softgroup.profile.api.router.ProfileRequestHandler;

/**
 * Created by nikmlk on 09.03.17.
 */
public interface ProfileFactory<T extends ProfileRequestHandler> extends Factory<T> {
}
