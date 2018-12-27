package com.fsales.demo.services;

import com.fsales.demo.domain.Categoria;
import com.fsales.demo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        return categoria;
    }
}
