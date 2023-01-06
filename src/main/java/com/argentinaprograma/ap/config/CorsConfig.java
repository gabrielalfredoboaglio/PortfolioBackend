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

       registry.addMapping("/login")
               .allowedOrigins("http://https://fronted-argentina-programa.web.app")
               .allowedMethods("*")
                       .exposedHeaders("*");
         registry.addMapping("/**");

                registry.addMapping("/api/**")
                   .allowedOrigins("http://https://fronted-argentina-programa.web.app")
                        .allowedMethods("*");




            }
        };
    }
}
