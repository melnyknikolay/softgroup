package com.softgroup.rest.controller;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.factory.FirstRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest",
                method = RequestMethod.POST,
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
public class MessengerRestController {

	@Autowired
	FirstRouter router;

	@RequestMapping(path = "/public")
	public Response<?> publicMessage(@RequestBody final Request<?> msg) {
		return router.handle(msg);
	}

	@RequestMapping(path = "/private")
	public Response<?> privateMessage(@RequestBody final Request<?> msg) {
		return router.handle(msg);
	}
}
