package com.softgroup.common.router.impl.router.factory;

import com.softgroup.common.router.api.CommonRouterHandler;
import com.softgroup.common.router.api.factory.RootFactory;
import com.softgroup.common.router.api.factory.RouterFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 07.03.17.
 */

@Component
public class RootFactoryImpl<T extends CommonRouterHandler> extends RouterFactory<T> implements RootFactory<T> {

}
