package com.softgroup.common.datamapper;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 * Created by nikmlk on 20.03.17.
 */

public class HibernateAwareObjectMapper extends ObjectMapper {
    private static final long serialVersionUID = -76612564121047602L;

    public HibernateAwareObjectMapper() {
        registerModule(new Hibernate4Module());
        setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
        setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

}
