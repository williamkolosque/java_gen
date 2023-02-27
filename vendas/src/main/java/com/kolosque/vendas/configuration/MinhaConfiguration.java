package com.kolosque.vendas.configuration;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@Development
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistemas de vendas";
    }


    @Bean
    public CommandLineRunner executar(){
//essa mensagem aparece no console
        return args -> {
            System.out.println("Rodando a configuração de desenvolvimento");
        };
    }

}
