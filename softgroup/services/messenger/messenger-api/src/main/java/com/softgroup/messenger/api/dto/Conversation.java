package com.softgroup.messenger.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nikmlk on 24.02.17.
 */
public class Conversation implements Serializable {
    private static final long serialVersionUID = -4265247275851292012L;

    private String id;
    private String name;
    private String logo_image_uri;
    private String type;
    private Long last_message_index;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo_image_uri() {
        return logo_image_uri;
    }

    public void setLogo_image_uri(String logo_image_uri) {
        this.logo_image_uri = logo_image_uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getLast_message_index() {
        return last_message_index;
    }

    public void setLast_message_index(Long last_message_index) {
        this.last_message_index = last_message_index;
    }
}
