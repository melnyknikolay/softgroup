package com.softgroup.common.protocol;

import java.io.Serializable;

public enum ResponseStatus implements Serializable {

    OK(200, "ok"),
    BAD_REQUEST(400, "Bad request"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not fount"),
    NOT_ACCEPTABLE(406, "Not acceptable"),
    UNPROCESABLE_ENTITY(422, "Unprocessable Entity"),
    TOO_MANY_REQUEST(429, "Too Many Requests"),
    INTERNAL_SERVER_ERROR(500, "internal server error"),
    NOT_IMPLEMENTED(501, "not implemented");

    private Integer code;
    private String message;

    ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
