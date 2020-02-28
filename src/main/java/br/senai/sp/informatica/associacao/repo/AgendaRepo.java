package br.senai.sp.informatica.associacao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.informatica.associacao.model.Agenda;

public interface AgendaRepo extends JpaRepository<Agenda, Integer>{

}
