package com.argentinaprograma.ap.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.util.*;


public class TokenUtils {

    private final static String ACCESS_TOKEN_SECRET = "4qhq8LrEBfYcaRHxhdb9zURb2rf8e7Ud";

    private static Long ACCES_TOKEN_VALIDITY_SECONDS = 24 * 60 * 60L; //24 hours

    public static String createToken(String nombre, String email){
        long expirationTime = ACCES_TOKEN_VALIDITY_SECONDS * 1000;
        Date expirationDate = new Date(System.currentTimeMillis()+ expirationTime);


        Map<String, Object> extra = new HashMap<>();
        extra.put("nombre", nombre);

        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                        .addClaims(extra)
                        .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
                        .compact();



    }

public static UsernamePasswordAuthenticationToken getAuthentication (String token){
try {
    Claims claims = Jwts.parserBuilder()
            .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
            .build()
            .parseClaimsJws(token)
            .getBody();


    String email = claims.getSubject();

    return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());
} catch (JwtException e){

    return  null;
}

}
}
