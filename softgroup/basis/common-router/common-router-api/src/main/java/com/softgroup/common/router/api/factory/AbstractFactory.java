package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by nikmlk on 24.02.17.
 */

public abstract class AbstractFactory<T extends Handler> implements Factory<T> {

    private Map<String, T> handlersMap;

    @Autowired
    private List<T> handlers;

    @PostConstruct
    private void init(){
        handlersMap = handlers.stream().collect(Collectors.toMap(Handler::getName, Function.identity()));
    }

    public T getHandler(Request<?> msg) {
        return handlersMap.get(getKey(msg));
    }

    protected abstract String getKey(Request<?> msg);
}
