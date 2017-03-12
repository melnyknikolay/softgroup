package com.softgroup.common.router.api;


import com.fasterxml.jackson.core.type.TypeReference;
import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.exceptions.MapperException;
import com.softgroup.common.protocol.*;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData> implements RequestHandler {

	@Autowired
	private DataMapper mapper;

	@Override
	public Response<R> handle(Request<?> msg) {
		try {
			T data = mapper.convert(msg.getData(), new TypeReference<T>() {
			});
			Request<T> typedRequest = ProtocolUtils.getRequest(msg, data);
			return doHandle(typedRequest);
		}catch (MapperException e){
			return ProtocolUtils.errorResponse(msg, ResponseStatus.BAD_REQUEST);
		}
	}

	protected abstract Response<R> doHandle(Request<T> msg);

}
