package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetOtherProfilesRequest implements RequestData {
    private static final long serialVersionUID = -7007337128218165529L;

    private Integer user_id;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
