package com.contatopessoa.api.controller;

import com.contatopessoa.api.model.Contato;
import com.contatopessoa.api.model.Pessoa;
import com.contatopessoa.api.service.ContatoService;
import com.contatopessoa.api.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContatoController {
    @Autowired
    private ContatoService contatoService;
    private PessoaService pessoaService;
    @PostMapping("/pessoas/{id}/contatos")
    public Contato saveContato(@RequestBody Contato contato, @PathVariable Integer id ){

        Pessoa pessoa = pessoaService.findById(id).get();
        contato.setPessoa(pessoa);

        return contatoService.save(contato);
    }
    @GetMapping("/contatos/{id}")
    public Contato findContato(@PathVariable Integer id){
        return contatoService.findById(id).get();
    }
    @GetMapping("/pessoas/{idPessoa}/contatos")
    public List<Contato> findPessoaContatos(@PathVariable Integer idPessoa){
        return contatoService.findByPessoaId(idPessoa);
    }
    @PutMapping("/contatos/{id}")
    public Contato updateContato(@RequestBody Contato contato, @PathVariable Integer id){
        contato.setId(id);
        return contatoService.save(contato);
    }
    @DeleteMapping("/contatos/{id}")
    public Contato deleteContato(@PathVariable Integer id){
        return contatoService.deleteById(id);
    }
}
