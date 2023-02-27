package com.kolosque.vendas.service;

import com.kolosque.vendas.model.Cliente;
import com.kolosque.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    //Aqui são feitas as regras de negocio da aplicação

    private ClientesRepository repository; // instacia o objeto para chamar ele aqui

    /*
    pode se injetar assim sem construtor

    @Autowired
    private ClientesRepository repository;
     */




    //construtor
    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }



    public void salvarCliente(Cliente cliente){

        validarCliente(cliente);

        this.repository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){


    }

}
