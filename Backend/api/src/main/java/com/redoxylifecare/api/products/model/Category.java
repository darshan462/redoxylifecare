package com.redoxylifecare.api.products.model;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Category {

    private Long id ;
    private String name ;
    private String createdBy;
    private Date updateOn ;
    
}
