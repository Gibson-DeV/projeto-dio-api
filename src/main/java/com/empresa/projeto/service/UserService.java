package com.empresa.projeto.service;

import com.empresa.projeto.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Cliente findById(Long id);

    Cliente create(Cliente cliente);
}
