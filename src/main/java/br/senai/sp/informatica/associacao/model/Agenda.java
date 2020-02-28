package br.senai.sp.informatica.associacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


import lombok.Data;

@Data
@Entity
public class Agenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAgenda;
	private String horario;
	
	@ManyToOne
	@JoinTable(name = "Associados",
			joinColumns = { @JoinColumn(name="idAgenda")},
			inverseJoinColumns = { @JoinColumn(name="idAssociado")})
	private Associado associado;
	
	@ManyToOne
	@JoinTable(name = "Atividades",
	joinColumns = { @JoinColumn(name="idAgenda")},
	inverseJoinColumns = { @JoinColumn(name="idAtividade")})
	private Atividade atividade;
	
	
	
}
