package com.softgroup.common.datamapper.configuration;

import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.HibernateAwareObjectMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author DoctoRJurius
 */
@Configuration
public class DataMapperAppCfg {
    @Bean
    public DataMapper dataMapper() {
        return new JacksonDataMapper();
    }

//    @Bean
//    public HibernateAwareObjectMapper objectMapper() {
//        return new HibernateAwareObjectMapper();
//    }
}
