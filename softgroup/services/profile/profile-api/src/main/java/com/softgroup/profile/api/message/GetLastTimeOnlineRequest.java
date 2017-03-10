package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetLastTimeOnlineRequest implements RequestData {
    private static final long serialVersionUID = -4479406554098022521L;

    private Integer uuid;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }
}
