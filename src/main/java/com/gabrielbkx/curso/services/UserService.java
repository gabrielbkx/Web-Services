package com.gabrielbkx.curso.services;

import com.gabrielbkx.curso.entities.User;
import com.gabrielbkx.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired // Anotação spring que "diz" que a UserRepository é uma dependencia
    private UserRepository repository; // dependencia: a classe UserService nao funciona sem o UserRepository

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){

        Optional<User> user = repository.findById(id);
        return user.get();
    }

}
