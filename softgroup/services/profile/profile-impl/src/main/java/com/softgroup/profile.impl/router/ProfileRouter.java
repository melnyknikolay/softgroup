package com.softgroup.profile.impl.router;

import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.profile.api.router.ProfileRouterHandler;
import com.softgroup.profile.api.router.factory.ProfileFactory;
import org.springframework.stereotype.Component;

/**
 * Created by nikmlk on 24.02.17.
 */

@Component
public class ProfileRouter extends AbstractRouterHandler<ProfileFactory> implements ProfileRouterHandler {

    @Override
    public String getName() {
        return "profile";
    }

}
