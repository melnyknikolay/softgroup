package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.Data;

/**
 * @author odin
 * @since 20.02.17.
 */
public class LoginRequest implements Data {

	private static final long serialVersionUID = 4895237867750981751L;

	private String deviceToken;

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
}
