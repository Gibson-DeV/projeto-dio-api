package com.empresa.projeto.service.impl;

import com.empresa.projeto.entity.Cliente;
import com.empresa.projeto.repository.ClienteRepository;
import com.empresa.projeto.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService{

    private final ClienteRepository clienteRepository;

    public UserServiceImpl(ClienteRepository clienteRepository, ClienteRepository clienteRepository1){

        this.clienteRepository = clienteRepository1;
    }
    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Cliente create(Cliente cliente) {
        if (cliente.getId() != null && clienteRepository.existsById(cliente.getId())){
            throw new IllegalArgumentException("Usuário já cadastrado na base de dados");
        }
        return clienteRepository.save(cliente);
    }
}
