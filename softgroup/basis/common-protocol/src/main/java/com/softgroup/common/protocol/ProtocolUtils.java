package com.softgroup.common.protocol;

import java.io.Serializable;


/**
 * Created by nikmlk on 08.03.17.
 */

public class ProtocolUtils {

    public static <T extends Serializable> Request<T> getRequest(Request<?> msg, T data) {
        return new Request.Builder<T>()
                .setHeader(msg.getHeader())
                .setData(data)
                .build();
    }

    public static <T extends Serializable> Response<T> getResponse(Request<?> msg, T data, ResponseStatus status){
        return new Response.Builder<T>()
                .setHeader(new ActionHeader.Builder(msg.getHeader()).build())
                .setData(data)
                .setStatus(status)
                .build();
    }

    public static <T extends Serializable> Response<T> getResponse(Request<?> msg, T data){
        return getResponse(msg, data, ResponseStatus.OK);
    }

    public static <T extends Serializable> Response<?> errorResponse(Request<?> msg, ResponseStatus status){
        return getResponse(msg, null, status);
    }
}
