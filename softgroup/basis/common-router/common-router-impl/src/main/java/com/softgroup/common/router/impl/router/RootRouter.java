package com.softgroup.common.router.impl.router;


import com.softgroup.common.protocol.ProtocolBeansFactory;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.factory.RootFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 02.03.17.
 */

@Component
public class RootRouter<T extends RootFactory> extends AbstractRouterHandler<T>{
    @Override
    public String getName() {
        return "root";
    }
}
