package com.gabrielbkx.curso.services;

import com.gabrielbkx.curso.entities.Category;
import com.gabrielbkx.curso.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> cat = repository.findById(id);
        return cat.get();
    }
}

