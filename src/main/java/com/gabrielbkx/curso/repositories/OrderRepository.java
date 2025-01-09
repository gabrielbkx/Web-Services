package com.gabrielbkx.curso.repositories;

import com.gabrielbkx.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
