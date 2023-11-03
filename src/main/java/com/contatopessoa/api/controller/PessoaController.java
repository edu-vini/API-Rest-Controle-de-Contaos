package com.contatopessoa.api.controller;

import com.contatopessoa.api.model.Pessoa;
import com.contatopessoa.api.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService service;
    @PostMapping
    public Pessoa savePessoa(@RequestBody Pessoa pessoa){
        return service.save(pessoa);
    }
    @GetMapping("/{id}")
    public Pessoa findPessoa(@PathVariable Integer id){
        return service.findById(id).get();
    }
    @GetMapping
    public List<Pessoa> findPessoas(){
        return service.findAll();
    }
    @PutMapping("/{id}")
    public Pessoa updatePessoa(@RequestBody Pessoa pessoa, @PathVariable Integer id){

        Pessoa pessoaBd = service.findById(id).get();

        String nome = pessoa.getNome();
        String endereco = pessoa.getEndereco();
        String cep = pessoa.getCep();
        String cidade = pessoa.getCidade();
        String uf = pessoa.getUf();

        if(nome != null){
            pessoaBd.setNome(nome);
        }
        if(endereco != null){
            pessoaBd.setEndereco(endereco);
        }
        if(cep != null){
            pessoaBd.setCep(cep);
        }
        if(cidade != null){
            pessoaBd.setCidade(cidade);
        }
        if(uf != null){
            pessoaBd.setUf(uf);
        }
        return service.save(pessoaBd);
    }
    @DeleteMapping("/{id}")
    public Pessoa deletePessoa(@PathVariable Integer id){
        return service.deleteByID(id);
    }

}
