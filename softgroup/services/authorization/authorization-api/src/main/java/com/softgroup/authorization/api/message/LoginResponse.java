package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.Data;

/**
 * @author odin
 * @since 20.02.17.
 */
public class LoginResponse implements Data {

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
