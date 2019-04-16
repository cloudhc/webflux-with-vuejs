package com.example.webfluxwithkotlin;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters.fromObject;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {

    fun index(request: ServerRequest) : Mono<ServerResponse> {
        return ServerResponse.ok().contentType(MediaType.TEXT_HTML)
            .render("index");
    }

    fun hello(request: ServerRequest) : Mono<ServerResponse> {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
            .body(fromObject("Hello, Spring!"));
    }
}
