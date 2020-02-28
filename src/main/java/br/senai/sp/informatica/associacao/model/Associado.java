package br.senai.sp.informatica.associacao.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Associado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nome;
	private String endereco;
	private Integer idade;
	private String telefone;
	private String email;
	private boolean desativado;
	
	@JsonIgnore
	@OneToMany(mappedBy="associado")
	private List<Agenda> agendamentos;

}
