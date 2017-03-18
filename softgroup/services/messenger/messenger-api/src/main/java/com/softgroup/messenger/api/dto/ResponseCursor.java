package com.softgroup.messenger.api.dto;

import java.io.Serializable;

/**
 * Created by nikmlk on 18.03.17.
 */
public class ResponseCursor implements Serializable {
    private static final long serialVersionUID = -3355605510896157472L;

    private Boolean isMoreExists;

    public Boolean getMoreExists() {
        return isMoreExists;
    }

    public void setMoreExists(Boolean moreExists) {
        isMoreExists = moreExists;
    }
}
