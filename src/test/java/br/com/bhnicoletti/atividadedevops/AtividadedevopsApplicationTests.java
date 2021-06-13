package br.com.bhnicoletti.atividadedevops;

import br.com.bhnicoletti.atividadedevops.domain.model.Pessoa;
import br.com.bhnicoletti.atividadedevops.domain.service.CadastroPessoaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class AtividadedevopsApplicationTests {

	@Autowired
	private CadastroPessoaService pessoaService;

	@Test
	void contextLoads() {

		Pessoa pessoa = new Pessoa("Bruno");
		pessoaService.salvar(pessoa, null);

		var p = pessoaService.buscar(pessoa.getId());

		p.setNome("Joao");
		pessoaService.salvar(p, p.getId());

		pessoaService.listarTodos();

		pessoaService.deltar(p.getId());


	}

}
