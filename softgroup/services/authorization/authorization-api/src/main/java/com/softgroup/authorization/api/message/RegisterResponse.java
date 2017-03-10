package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.Data;

/**
 * @author odin
 * @since 20.02.17.
 */
public class RegisterResponse implements Data {
	private static final long serialVersionUID = -5146888202653750948L;

	private String registration_request_uuid;
	private Integer registration_timeout_sec;
	private String auth_code;

	public String getRegistration_request_uuid() {
		return registration_request_uuid;
	}

	public void setRegistration_request_uuid(String registration_request_uuid) {
		this.registration_request_uuid = registration_request_uuid;
	}

	public Integer getRegistration_timeout_sec() {
		return registration_timeout_sec;
	}

	public void setRegistration_timeout_sec(Integer registration_timeout_sec) {
		this.registration_timeout_sec = registration_timeout_sec;
	}

	public String getAuth_code() {
		return auth_code;
	}

	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
	}
}
