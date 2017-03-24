package com.softgroup.common.dao.api.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nikmlk on 20.03.17.
 */

@Entity
@Table(name = "device")
public class DeviceEntity implements Serializable {
    private static final long serialVersionUID = -499946814102990644L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "device_id")
    private String deviceId;

    @ManyToOne(fetch = FetchType.EAGER)
    private ProfileEntity profile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ProfileEntity getProfile() {
        return profile;
    }

    public void setProfile(ProfileEntity profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeviceEntity that = (DeviceEntity) o;

        if (!id.equals(that.id)) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        return profile != null ? profile.equals(that.profile) : that.profile == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (profile != null ? profile.hashCode() : 0);
        return result;
    }
}
