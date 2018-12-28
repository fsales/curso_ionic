package com.fsales.demo.resources;

import com.fsales.demo.domain.Categoria;
import com.fsales.demo.domain.Cliente;
import com.fsales.demo.services.CategoriaService;
import com.fsales.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Long id) {

        Cliente cliente = service.buscar(id);
        return ResponseEntity.ok().body(cliente);
    }
}
