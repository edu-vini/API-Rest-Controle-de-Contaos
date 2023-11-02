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
        pessoa.setId(id);
        return service.save(pessoa);
    }
    @DeleteMapping("/{id}")
    public Pessoa deletePessoa(@PathVariable Integer id){
        return service.deleteByID(id);
    }

}
