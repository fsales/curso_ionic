package com.fsales.demo.services;

import com.fsales.demo.domain.Cliente;
import com.fsales.demo.repositories.ClienteRepository;
import com.fsales.demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Long id) {

        return clienteRepository.findById(id).orElseThrow(() ->
                new ObjectNotFoundException(" Objeto não encontrado Id: " + id + " Tipo: " + Cliente.class.getName()));
    }
}
