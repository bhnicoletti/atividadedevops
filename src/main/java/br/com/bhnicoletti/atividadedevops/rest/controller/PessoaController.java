package br.com.bhnicoletti.atividadedevops.rest.controller;

import br.com.bhnicoletti.atividadedevops.domain.model.Pessoa;
import br.com.bhnicoletti.atividadedevops.domain.service.CadastroPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private CadastroPessoaService pessoaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Pessoa> listar(){
       return pessoaService.listarTodos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Pessoa buscar(@PathVariable Long id){
        return pessoaService.buscar(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa salvar(@RequestBody Pessoa pessoa){
        return pessoaService.salvar(pessoa, null);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public  Pessoa salvar(@PathVariable Long id, @RequestBody Pessoa p){
       return pessoaService.salvar(p, id);
    }
}
