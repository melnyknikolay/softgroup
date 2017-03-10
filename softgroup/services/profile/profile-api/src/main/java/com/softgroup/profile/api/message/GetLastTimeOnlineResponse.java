package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.dto.ProfileStatus;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetLastTimeOnlineResponse implements ResponseData {
    private static final long serialVersionUID = -5712064427245589902L;

    private ProfileStatus status;

    public ProfileStatus getStatus() {
        return status;
    }

    public void setStatus(ProfileStatus status) {
        this.status = status;
    }
}
