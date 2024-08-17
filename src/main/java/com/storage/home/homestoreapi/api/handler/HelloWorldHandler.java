package com.storage.home.homestoreapi.api.handler;

import com.storage.home.homestoreapi.repository.entity.ItemEntity;
import com.storage.home.homestoreapi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {

    @Autowired
    private ItemRepository itemRepository;

    public Mono<ServerResponse> sayHello(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(itemRepository.findAll(), ItemEntity.class);
    }
}
