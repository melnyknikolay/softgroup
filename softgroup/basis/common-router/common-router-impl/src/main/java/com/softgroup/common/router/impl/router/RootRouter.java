package com.softgroup.common.router.impl.router;

import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.factory.FirstRouter;
import com.softgroup.common.router.api.factory.RootRouterFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 02.03.17.
 */

@Component
public class RootRouter extends AbstractRouterHandler<RootRouterFactory> implements FirstRouter{
    public static final Logger LOG = LoggerFactory.getLogger(RootRouter.class);

    @Override
    public String getName() {
        LOG.info("name", "root");
        return "root";
    }
}
