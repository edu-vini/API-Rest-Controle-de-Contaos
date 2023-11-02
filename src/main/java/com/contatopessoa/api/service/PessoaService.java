package com.contatopessoa.api.service;

import com.contatopessoa.api.model.Pessoa;
import com.contatopessoa.api.model.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public Pessoa save(Pessoa pessoa){
        return repository.save(pessoa);
    }
    public List<Pessoa> findAll(){
        return repository.findAll();
    }
    public Optional<Pessoa> findById(Integer id){
        return repository.findById(id);
    }
    public Pessoa deleteByID(Integer id){
        Pessoa pessoa = this.findById(id).get();
        repository.deleteById(id);
        return pessoa;
    }
}
