package com.redoxylifecare.api.category.repository;

import com.redoxylifecare.api.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
