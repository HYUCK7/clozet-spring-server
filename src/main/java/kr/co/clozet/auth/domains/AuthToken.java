package kr.co.clozet.auth.domains;

import io.jsonwebtoken.*;
import lombok.Builder;
import lombok.extern.java.Log;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName:kr.co.clozet.security.domains
 * fileName        :SecurityToken.java
 * author          : sungsuhan
 * date            :2022-05-23
 * desc            :AWS책 p.236
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-23           sungsuhan      최초 생성
 **/
@Log
public class AuthToken {
    private String token;
    private String key;

    public AuthToken(String key) {
        this.key = key;
        this.token = createToken();
    }

    private String createToken() {
        try {
            Map<String, Object> headers = new HashMap<>();
            headers.put("typ","JWT");
            headers.put("alg","HS256");
            Map<String, Object> payload = new HashMap<>();
            headers.put("data","dummy");
            Date ext = new Date();
            ext.setTime(ext.getTime() * 1000 * 6L * 2L);
            return Jwts.builder()
                    .setHeader(headers)
                    .setClaims(payload)
                    .setSubject("user")
                    .setExpiration(ext)
                    .signWith(SignatureAlgorithm.HS256, key.getBytes())
                    .compact();
        }
        catch (SecurityException e) {log.info("SecurityException JWT");}
        catch (MalformedJwtException e) {log.info("MalformedJwtException JWT");}
        catch (ExpiredJwtException e) {log.info("ExpiredJwtException JWT");}
        catch (UnsupportedJwtException e) {log.info("UnsupportedJwtException JWT");}
        catch (IllegalAccessError e) {log.info("IllegalAccessError JWT");}
        return null;
    }
}
