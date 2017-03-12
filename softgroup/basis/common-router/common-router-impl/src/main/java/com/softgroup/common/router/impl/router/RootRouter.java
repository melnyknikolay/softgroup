package com.softgroup.common.router.impl.router;

import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.factory.RootRouterFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 02.03.17.
 */

@Component
public class RootRouter extends AbstractRouterHandler<RootRouterFactory>{
    @Override
    public String getName() {
        return "root";
    }
}
