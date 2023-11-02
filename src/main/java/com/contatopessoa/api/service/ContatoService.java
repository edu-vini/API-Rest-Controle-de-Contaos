package com.contatopessoa.api.service;

import com.contatopessoa.api.model.Contato;
import com.contatopessoa.api.model.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ContatoService {
    @Autowired
    private ContatoRepository repository;
    public Contato save( Contato contato){
        return repository.save(contato);
    }
    public List<Contato> findAll(){
        return repository.findAll();
    }
    public Optional<Contato> findById(Integer id){
        return repository.findById(id);
    }
    public Contato deleteById(Integer id){
        Contato contato = this.findById(id).get();
        repository.deleteById(id);
        return contato;
    }
    public List<Contato> findByPessoaId(Integer pessoaId){
        return repository.findByPessoaId(pessoaId);
    }
}
