package com.useall.useall;

import com.useall.useall.domain.Cliente;
import com.useall.useall.repository.ClienteRepository;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UseallApplication implements CommandLineRunner {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(UseallApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Cliente cli1 = new Cliente("Artur Dias Ribeiro", "123.456.789-00", sdf.parse("06/09/2021"), "endereço", "(54)99663-0228");
        clienteRepository.save(cli1);
    }
    
}
