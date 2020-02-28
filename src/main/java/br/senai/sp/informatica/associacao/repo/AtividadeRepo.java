package br.senai.sp.informatica.associacao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.informatica.associacao.model.Atividade;

public interface AtividadeRepo extends JpaRepository<Atividade, Integer> {

}
