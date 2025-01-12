package com.gabrielbkx.curso.repositories;

import com.gabrielbkx.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
