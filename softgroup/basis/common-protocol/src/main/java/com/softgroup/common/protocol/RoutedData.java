package com.softgroup.common.protocol;

/**
 * Created by nikmlk on 19.03.17.
 */
public class RoutedData implements Data {
    private static final long serialVersionUID = -9075891830701110160L;

    private Integer id;
    private Integer deviceId;
    private Integer serverId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }
}
