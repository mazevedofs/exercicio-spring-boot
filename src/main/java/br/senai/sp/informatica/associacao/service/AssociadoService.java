package br.senai.sp.informatica.associacao.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.sp.informatica.associacao.model.Associado;
import br.senai.sp.informatica.associacao.repo.AssociadoRepo;

@Service
public class AssociadoService {
	@Autowired
	private AssociadoRepo repo;
	
	public void salvar(Associado associado) {
		repo.save(associado);
	}
	
	public List<Associado> getAssociados() {
		return repo.findAll().stream()
				.filter(associado -> !associado.isDesativado())
				.collect(Collectors.toList());
	}

}
