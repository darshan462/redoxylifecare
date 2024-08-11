package com.redoxylifecare.api.products.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Product {

    @Column(name = 'id')
    private Long id ;

    @Column(name = 'name')
    private String name;

    @Column(name = 'category')
    private String categories ;
}
