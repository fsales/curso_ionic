package com.fsales.demo.services;

import com.fsales.demo.domain.Categoria;
import com.fsales.demo.repositories.CategoriaRepository;
import com.fsales.demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id) {

        return categoriaRepository.findById(id).orElseThrow(() ->
                new ObjectNotFoundException(" Objeto não encontrado Id: " + id + " Tipo: " + Categoria.class.getName()));
    }
}
