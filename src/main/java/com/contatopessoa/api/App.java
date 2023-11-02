package com.contatopessoa.api;

import com.contatopessoa.api.model.Contato;
import com.contatopessoa.api.model.Pessoa;
import com.contatopessoa.api.model.PessoaRepository;
import com.contatopessoa.api.service.ContatoService;
import com.contatopessoa.api.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {
    @Autowired
    private PessoaService pessoaService;
    private ContatoService contatoService;

    @Override
    public void run(String... args) throws Exception {

        Pessoa pessoa1, pessoa2, pessoa3;
        Contato contato1, contato2, contato3, contato4, contato5, contato6;

        System.out.println("Adicionando Pessoas");

        pessoa1 = new Pessoa();
        pessoa1.setNome("Vinicius");
        pessoa1.setCep("00000001");
        pessoa1.setCidade("Joao Pessoa");
        pessoa1.setUf("PB");
        pessoa1.setEndereco("Rua Tal, 1");

        pessoaService.save(pessoa1);

        pessoa2 = new Pessoa();
        pessoa2.setNome("Adriano");
        pessoa2.setCep("00000002");
        pessoa2.setCidade("Joao Pessoa");
        pessoa2.setUf("PB");
        pessoa2.setEndereco("Rua Tal, 2");

        pessoaService.save(pessoa2);

        pessoa3 = new Pessoa();
        pessoa3.setNome("Arthur");
        pessoa3.setCep("00000003");
        pessoa3.setCidade("Natal");
        pessoa3.setUf("RN");
        pessoa3.setEndereco("Rua Tal, 3");

        pessoaService.save(pessoa3);

        //Ajustar criacao de Contatos
    }
}
