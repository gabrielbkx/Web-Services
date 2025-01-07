package com.gabrielbkx.curso.repositories;

import com.gabrielbkx.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
