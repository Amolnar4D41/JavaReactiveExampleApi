package com.storage.home.homestoreapi.database;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ItemRepository extends R2dbcRepository<Item, String> {

    @Override
    Flux<Item> findAll();
}
