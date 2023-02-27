package com.kolosque.vendas.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Configuration
@Profile("development")
public @interface Development {
    //assim configura uma anotação para não ficar colocando o profile
    //Essa anotação e configuração é apenas para classes
}
