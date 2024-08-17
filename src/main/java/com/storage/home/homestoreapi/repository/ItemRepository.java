package com.storage.home.homestoreapi.repository;

import com.storage.home.homestoreapi.repository.entity.ItemEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ItemRepository extends R2dbcRepository<ItemEntity, Integer> {

    @Override
    Flux<ItemEntity> findAll();

    @Override
    Mono<ItemEntity> findById(Integer id);

    @Override
    <S extends ItemEntity> Mono<S> save(S item);
}
