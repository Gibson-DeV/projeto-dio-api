package com.empresa.projeto;

import com.empresa.projeto.entity.Cliente;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "URL PADRAO")})
@SpringBootApplication
public class StartApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartApplication.class, args);

    }
}
