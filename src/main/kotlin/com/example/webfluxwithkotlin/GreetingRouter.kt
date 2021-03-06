package com.example.webfluxwithkotlin;

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class GreetingRouter(private val handler: GreetingHandler) {
    
    @Bean
    fun route() = router {
        GET("/", handler::index)
        GET("/hello", handler::hello) 
    }
}
