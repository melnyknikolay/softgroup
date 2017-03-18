package com.softgroup.common.token.api;

import java.util.function.Function;

/**
 * Created by nikmlk on 18.03.17.
 */
public interface TokenFactory {
    String createDeviceToken(Integer userId, Integer deviceId);
    String createAccessToken(String token);
    boolean validate(String token, TokenType type);
}
