package br.com.bhnicoletti.atividadedevops.domain.repository;

import br.com.bhnicoletti.atividadedevops.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
