package com.storage.home.homestoreapi.api.router;

import com.storage.home.homestoreapi.api.handler.HelloWorldHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class InventoryRouter {

    private final HelloWorldHandler helloWorldHandler;

    @Autowired
    public InventoryRouter(HelloWorldHandler helloWorldHandler) {
        this.helloWorldHandler = helloWorldHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions.route()
                .GET("/", helloWorldHandler::sayHello)
                .build();
    }
}
