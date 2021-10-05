package com.example.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
class CorsConfig {

    private val GET = "GET"
    private val POST = "POST"
    private val PUT = "PUT"
    private val DELETE = "DELETE"

    @Bean
    fun corsConfigurer(): WebMvcConfigurer? {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                registry.addMapping("/**")
                    .allowedMethods(GET, POST, PUT, DELETE)
                    .allowedHeaders("*")
                    .allowedOriginPatterns("*")
                    .allowCredentials(true)
            }
        }
    }
}