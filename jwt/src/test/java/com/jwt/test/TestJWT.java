package com.jwt.test;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pms
 * @date 2020/3/24 16:14
 * @since 1.0
 */
public class TestJWT {

    @Test
    public void createJWT(){
        //secret the secret to use in the verify or signing instance.
        Algorithm algorithm = Algorithm.HMAC256("123");
        Map<String, Object> headerClaims = new HashMap<>();
        headerClaims.put("product","02");
        String token = JWT.create()
                .withHeader(headerClaims)//header
                .withIssuer("admin")//Payload
                .sign(algorithm);//algorithm
        System.out.println(token);

        /*
        header
        {
          "product": "02",
          "typ": "JWT",
          "alg": "HS256"
        }
        PAYLOAD:
        {
          "iss": "admin"
        }
         */
    }

    @Test
    public void verifyToken(){
        String token="eyJwcm9kdWN0IjoiMDIiLCJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhZG1pbiJ9.YC0_5I3Ux77euyw46UintYkflrr32G1RhctQOYfVmiA";
        Algorithm algorithm = Algorithm.HMAC256("123");
        Map<String, Object> headerClaims = new HashMap<>();
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("admin")//Payload
                .build(); //Reusable verifier instance
        DecodedJWT jwt = verifier.verify(token);
    }
}
