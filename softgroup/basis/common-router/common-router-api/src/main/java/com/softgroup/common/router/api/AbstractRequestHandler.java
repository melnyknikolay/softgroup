package com.softgroup.common.router.api;


import com.fasterxml.jackson.core.type.TypeReference;
import com.softgroup.common.exceptions.MapperException;
import com.softgroup.common.protocol.*;


public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData> implements RequestHandler {

	@Override
	public Response<R> handle(Request<?> msg) {
		try {
			Request<T> typedRequest = ProtocolBeansFactory.getTypedRequest(msg, new TypeReference<T>() {});
			return doHandle(typedRequest);
		}catch (MapperException e){
			return ProtocolBeansFactory.badRequest(msg);
		}
	}

	protected abstract Response<R> doHandle(Request<T> msg);

}
