package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.dto.Profile;

import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class GetContactProfilesResponse implements ResponseData {
    private static final long serialVersionUID = 7182031214980471450L;

    private List<Profile> profiles;

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }
}
