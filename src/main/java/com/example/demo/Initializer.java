package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer  implements CommandLineRunner {
    private final WebClient usuarioClient;
    public Initializer(WebClient usuarioClient) {
        this.usuarioClient = usuarioClient;
    }

    @Override
    public void run(String... args) throws Exception {
        CepDTO cepDTO = usuarioClient.buscaCep("01310922");
        System.out.println(cepDTO);
    }
}
