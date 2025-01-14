package com.gabrielbkx.curso.services;

import com.gabrielbkx.curso.entities.User;
import com.gabrielbkx.curso.repositories.UserRepository;
import com.gabrielbkx.curso.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired // Anotação spring que "diz" que a UserRepository é uma dependencia
    private UserRepository repository; // dependencia: a classe UserService nao funciona sem o UserRepository

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {

        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);

        }catch(RuntimeException e) {
            e.printStackTrace();

        }
    }

    public User update(long id,User obj){
       try{
           User entity = repository.getReferenceById(id);
           updateData(entity,obj);
           return repository.save(entity);

       }catch(EntityNotFoundException e) {
           throw new ResourceNotFoundException(id);
       }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
