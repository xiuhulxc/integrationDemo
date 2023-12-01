package com.example.demo.module.system.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/12/1 11:14
 * @version: 1.0
 */

@Slf4j
@RequiredArgsConstructor
@Component
public class JwtTokenProvider {

    private String secretKey;

    // @Autowired
    // private SwaggerCfgProp cfgProp;

    /**
     * token过期时间 7天
     */
    public static final long TOKEN_VALID_MILLISECONDS = 1000L * 60 * 60 * 24 * 7;

    @PostConstruct
    protected void init() {
        // secretKey = Base64.getEncoder().encodeToString(cfgProp.getJwt().getSecret().getBytes());
    }

    public String createToken(Map<String, String> attributes) {
        // Claims claims = Jwts.claims();
        // claims.putAll(attributes);
        // Date now = new Date();
        // return Jwts.builder().setClaims(claims).setIssuedAt(now)
        //         .setExpiration(new Date(now.getTime() + TOKEN_VALID_MILLISECONDS))
        //         .signWith(SignatureAlgorithm.HS256, secretKey).compact();
        return null;
    }

}
