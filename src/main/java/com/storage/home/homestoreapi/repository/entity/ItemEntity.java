package com.storage.home.homestoreapi.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("items")
public class ItemEntity {
    @Id
    private int id;
    private String title;
    private int amount;
    private int capacity;
}
