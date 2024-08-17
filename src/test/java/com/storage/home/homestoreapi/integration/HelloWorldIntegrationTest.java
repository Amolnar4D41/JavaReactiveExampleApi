package com.storage.home.homestoreapi.integration;

import com.storage.home.homestoreapi.database.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class HelloWorldIntegrationTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void testHelloWorld() {
        webClient.get()
                .uri("/")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(Item.class)
                .hasSize(3)
                .contains(
                        new Item("book"),
                        new Item("desk"),
                        new Item("pen")
                );
    }
}
