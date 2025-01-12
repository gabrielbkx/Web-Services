package com.gabrielbkx.curso.repositories;

import com.gabrielbkx.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
