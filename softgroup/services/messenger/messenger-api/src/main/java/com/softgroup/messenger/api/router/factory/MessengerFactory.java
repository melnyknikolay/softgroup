package com.softgroup.messenger.api.router.factory;

import com.softgroup.common.router.api.factory.Factory;
import com.softgroup.messenger.api.router.MessengerRequestHandler;

/**
 * Created by nikmlk on 09.03.17.
 */
public interface MessengerFactory<T extends MessengerRequestHandler> extends Factory<T> {
}
