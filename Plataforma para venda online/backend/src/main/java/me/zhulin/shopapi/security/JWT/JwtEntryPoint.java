package me.zhulin.shopapi.security.JWT;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Criado por Dorgival Fernando em 30/08/2020.
 */
@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {


    private static final Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);

    // chamado se a autenticação falhou
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException e)
            throws IOException {

        logger.error("Unauthorized error. Message - {}", e.getMessage());
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
    }
}