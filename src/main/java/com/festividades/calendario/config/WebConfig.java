package com.festividades.calendario.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
            .allowedOrigins("*") // ✅ Permite cualquier origen (solo recomendable en desarrollo)
            .allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowedHeaders("*");
}

        };
    }
}
