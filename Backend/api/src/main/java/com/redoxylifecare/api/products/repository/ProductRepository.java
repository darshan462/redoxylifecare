package com.redoxylifecare.api.products.repository;

import com.redoxylifecare.api.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
