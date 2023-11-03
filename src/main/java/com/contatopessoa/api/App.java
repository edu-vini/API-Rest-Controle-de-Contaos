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

    @Autowired
    private ContatoService contatoService;

    @Override
    public void run(String... args) throws Exception {

        Pessoa pessoa1, pessoa2, pessoa3;
        Contato contato1, contato2, contato3, contato4, contato5, contato6;

        System.out.println("Adicionando Pessoas...");

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

        System.out.println("Adicionando Contatos as Pessoas...");

        contato1 = new Contato();
        contato1.setTipo(0);
        contato1.setContato(839000000001L);
        contato1.setPessoa(pessoa1);
        contatoService.save(contato1);

        contato2 = new Contato();
        contato2.setTipo(0);
        contato2.setContato(839000000002L);
        contato2.setPessoa(pessoa1);
        contatoService.save(contato2);

        contato3 = new Contato();
        contato3.setTipo(0);
        contato3.setContato(839000000003L);
        contato3.setPessoa(pessoa1);
        contatoService.save(contato3);

        contato4 = new Contato();
        contato4.setTipo(0);
        contato4.setContato(839000000004L);
        contato4.setPessoa(pessoa2);
        contatoService.save(contato4);

        contato5 = new Contato();
        contato5.setTipo(0);
        contato5.setContato(839000000005L);
        contato5.setPessoa(pessoa2);
        contatoService.save(contato5);

        contato6 = new Contato();
        contato6.setTipo(0);
        contato6.setContato(839000000005L);
        contato6.setPessoa(pessoa3);
        contatoService.save(contato6);

    }
}
