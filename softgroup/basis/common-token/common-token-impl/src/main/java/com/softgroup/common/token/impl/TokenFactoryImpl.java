package com.softgroup.common.token.impl;

import com.softgroup.common.token.api.TokenFactory;
import com.softgroup.common.token.api.TokenType;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by nikmlk on 18.03.17.
 */

public class TokenFactoryImpl implements TokenFactory {

    private final String REFRESH_TOKEN_KEY = "QNFsBsUZjQ27aaczv7mqBDHrn2ldUH";
    private final String ACCESS_TOKEN_KEY = "SsmbwxHzKlvE5kDSM5mXkjahSrTrIc";

    @Override
    public String createDeviceToken(Integer userId, Integer deviceId) {
        if (deviceId == null || userId == null){
            return null;
        }
        Claims claims = Jwts.claims()
                .setExpiration(new DateTime().plusMonths(3).toDate())
                .setIssuedAt(new Date());
        claims.put("userID", userId);
        claims.put("deviceID", deviceId);
        claims.put("tokenType", TokenType.REFRESH_TOKEN);

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.PS384, REFRESH_TOKEN_KEY)
                .compact();
    }

    @Override
    public String createAccessToken(String token) {
        if (token == null){
            return null;
        }

        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(REFRESH_TOKEN_KEY).parseClaimsJws(token).getBody();
        }catch (Exception e){
            return null;
        }

        if (claims == null){
            return null;
        }

        claims.setExpiration(new DateTime().plusMinutes(10).toDate())
              .setIssuedAt(new Date())
              .put("tokenType", TokenType.ACCESS_TOKEN);


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.PS384, ACCESS_TOKEN_KEY)
                .compact();
    }

    @Override
    public boolean validate(String token, TokenType type) {
        if (token == null || type == null){
            return false;
        }
        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(getKeyByTokenType(type)).parseClaimsJws(token).getBody();
        }catch (Exception e){
            return false;
        }

        if(claims == null){
            return false;
        }

        return claims.getExpiration().before(new Date())
                && claims.getIssuedAt().after(new Date())
                && claims.get("tokenType").equals(type.name());

    }

    private String getKeyByTokenType(TokenType type){
        if (type == null){
            return null;
        }
        return type.equals(TokenType.REFRESH_TOKEN) ? REFRESH_TOKEN_KEY : ACCESS_TOKEN_KEY;
    }

}
