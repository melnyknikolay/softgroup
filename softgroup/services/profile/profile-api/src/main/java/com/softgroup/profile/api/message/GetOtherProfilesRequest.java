package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetOtherProfilesRequest implements RequestData {
    private static final long serialVersionUID = -7007337128218165529L;

    private Integer[] userIds;

    public Integer[] getUserIds() {
        return userIds;
    }

    public void setUserIds(Integer[] userIds) {
        this.userIds = userIds;
    }
}
