package com.storage.home.homestoreapi.repository;

import com.storage.home.homestoreapi.repository.entity.ItemEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ItemRepository extends R2dbcRepository<ItemEntity, String> {

    @Override
    Flux<ItemEntity> findAll();
}
