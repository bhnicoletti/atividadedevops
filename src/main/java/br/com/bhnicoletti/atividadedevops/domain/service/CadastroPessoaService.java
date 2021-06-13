package br.com.bhnicoletti.atividadedevops.domain.service;

import br.com.bhnicoletti.atividadedevops.domain.exception.EntidadeNaoEncontradaException;
import br.com.bhnicoletti.atividadedevops.domain.model.Pessoa;
import br.com.bhnicoletti.atividadedevops.domain.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodos(){
       return pessoaRepository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa, Long id){
        if(id == null)
        return pessoaRepository.save(pessoa);

        else{
            var p = buscar(id);
            pessoa.setId(p.getId());
            return pessoaRepository.save(pessoa);
        }
    }

    public Pessoa buscar(Long id){
        return pessoaRepository.findById(id).orElseThrow(
                () -> new EntidadeNaoEncontradaException("Pessoa não encontrada"));
    }

    public void deltar(Long id){
        var p = buscar(id);
        pessoaRepository.delete(p);
    }
}
