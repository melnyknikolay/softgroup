package com.softgroup.messenger.api.dto;

import java.io.Serializable;

/**
 * Created by nikmlk on 24.02.17.
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 6207472905627817341L;

    private Integer uuid;
    private String msg;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
