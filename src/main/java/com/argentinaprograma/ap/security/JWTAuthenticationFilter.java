package com.argentinaprograma.ap.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        AuthCredentials authCredentials = new AuthCredentials();
        try {
            authCredentials = new ObjectMapper().readValue(request.getInputStream(), AuthCredentials.class);
            UsernamePasswordAuthenticationToken authToken =  new UsernamePasswordAuthenticationToken(
                    authCredentials.getEmail(), authCredentials.getPassword());

            return getAuthenticationManager().authenticate(authToken);
        } catch (java.io.IOException e) {
            e.printStackTrace();

        }


        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                authCredentials.getEmail(),
                authCredentials.getPassword(),
                Collections.emptyList()
        );
        return getAuthenticationManager().authenticate(authToken);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

       UserDetailsImpl userDetails= (UserDetailsImpl) authResult.getPrincipal();
String token = TokenUtils.createToken(userDetails.getNombre(),userDetails.getUsername());

response.addHeader("Authorization","Bearer " + token);
response.getWriter().println("{\"token\": \"" + token + "\"}");
response.getWriter().flush();

        super.successfulAuthentication(request, response, chain, authResult);
    }
}
