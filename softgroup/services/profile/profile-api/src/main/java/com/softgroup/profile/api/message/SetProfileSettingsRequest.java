package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.api.dto.ProfileSettings;

/**
 * Created by nikmlk on 24.02.17.
 */
public class SetProfileSettingsRequest implements RequestData {
    private static final long serialVersionUID = -3668172891070371522L;

    private ProfileSettings settings;

    public ProfileSettings getSettings() {
        return settings;
    }

    public void setSettings(ProfileSettings settings) {
        this.settings = settings;
    }
}
