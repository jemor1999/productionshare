package com.study.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrossOriginConfig {
    @Bean
    public WebMvcConfigurer crossConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*")
                        .allowedOrigins("http://127.0.0.1:8081")
                        .allowCredentials(true)
                        .allowedMethods("*")
                        .maxAge(3600);
            }
        };
    }
}
