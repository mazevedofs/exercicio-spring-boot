package br.senai.sp.informatica.associacao.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Atividade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAtividade;
	private String nome;
	private double valor;
	private boolean desativado;
	
	@OneToMany(mappedBy = "atividade")
	private List<Agenda> agenda;
}
