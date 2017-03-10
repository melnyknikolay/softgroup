package com.softgroup.common.protocol;

import com.fasterxml.jackson.core.type.TypeReference;
import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.exceptions.MapperException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;


/**
 * Created by nikmlk on 08.03.17.
 */

public class ProtocolBeansFactory {

    @Autowired
    private static DataMapper mapper;

    public static <T extends Serializable> Response<T> serverError(Request<?> msg){
        return buildResponse(msg, null, ResponseStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T extends Serializable> Response<T> badRequest(Request<?> msg){
        return buildResponse(msg, null, ResponseStatus.BAD_REQUEST);
    }

    public static <T extends Serializable> Request<T> getTypedRequest(Request<?> msg, TypeReference<T> type) throws MapperException {
        T data = mapper.convert(msg.getData(), type);
        return buildRequest(msg, data);
    }

    private static <T extends Serializable> Request<T> buildRequest(Request<?> msg, T data){
        return new Request.Builder<T>()
                .setHeader(msg.getHeader())
                .setData(data)
                .build();
    }

    private static <T extends Serializable> Response<T> buildResponse(Request<?> msg, T data, ResponseStatus status){
        return new Response.Builder<T>()
                .setHeader(new ActionHeader.Builder(msg.getHeader()).build())
                .setData(data)
                .setStatus(status)
                .build();
    }
}
