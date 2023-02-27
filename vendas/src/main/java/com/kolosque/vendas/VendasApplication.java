package com.kolosque.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
/*
    @Autowired
    @Qualifier("applicationName")
    public String applicationName;
//esse metodo tras o que foi implementaado na classe minhaconfiguration, e pode ser usado @getmapping
//assim fazendo uma injeção de dependencia
*/
    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/hellobilu")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

}
