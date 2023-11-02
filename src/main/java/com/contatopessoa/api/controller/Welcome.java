package com.contatopessoa.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    public String Welcome(){
        return "Esta é uma API Rest de Gerenciamento de Contatos de Pessoas";
    }
}
