package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.ResponseData;

/**
 * Created by nikmlk on 24.02.17.
 */
public class SmsConfirmResponse implements ResponseData {
    private static final long serialVersionUID = 636717510400790106L;

    private String deviceToken;

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
