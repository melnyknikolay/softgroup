package com.softgroup.rest.configuration;

import com.softgroup.authorithation.impl.config.AuthAppCfg;
import com.softgroup.common.dao.impl.configuration.CommonDaoAppCfg;
import com.softgroup.common.datamapper.configuration.DataMapperAppCfg;
import com.softgroup.common.router.impl.config.RouterAppCfg;
import com.softgroup.common.token.impl.configuration.TokenAppCfg;
import com.softgroup.messenger.impl.config.MsgAppCfg;
import com.softgroup.profile.impl.config.ProfileAppCfg;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.softgroup.rest",
               excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
)
@Import({DataMapperAppCfg.class,
        CommonDaoAppCfg.class,
        RouterAppCfg.class,
        TokenAppCfg.class,
        AuthAppCfg.class,
        MsgAppCfg.class,
        ProfileAppCfg.class})
public class RestApplicationConfiguration {


}
