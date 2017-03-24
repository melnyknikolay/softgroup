package com.softgroup.rest.configuration;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.softgroup.rest",
               excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
)
public class RestApplicationConfiguration {


}
