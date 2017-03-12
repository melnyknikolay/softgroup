package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.RequestData;

/**
 * @author odin
 * @since 20.02.17.
 */
public class RegisterRequest implements RequestData {
	private static final long serialVersionUID = -645554380912935546L;

	private Integer phone_number;
	private String locale_code;
	private String device_id;

	public Integer getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}

	public String getLocale_code() {
		return locale_code;
	}

	public void setLocale_code(String locale_code) {
		this.locale_code = locale_code;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
}
