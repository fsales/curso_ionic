package com.fsales.demo.resources;

import com.fsales.demo.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar() {

        List<Categoria> lista = new ArrayList<>(Arrays.asList(new Categoria[]{new Categoria(1, "Informática"), new Categoria(2, "Escritório")}));

        return lista;
    }
}
