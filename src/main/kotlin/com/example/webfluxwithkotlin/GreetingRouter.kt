package com.example.webfluxwithkotlin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.router;

@Configuration
public class GreetingRouter(private val handler: GreetingHandler) {
    
    @Bean
    fun route() = router {
        GET("/hello", handler::hello) 
    }
}
