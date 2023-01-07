package com.argentinaprograma.ap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer(){
return new WebMvcConfigurer() {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("https://frontend-ang.web.app/index")
                .allowedMethods("*")
                .exposedHeaders("*");

        registry.addMapping("/**")
                .allowedOrigins("https://frontend-ang.web.app/index")
                .allowedMethods("*")
                .exposedHeaders("*");









            }
        };
    }
}
