package com.jessica.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jessica.cursomc.domain.Categoria;
import com.jessica.cursomc.repositories.CategoriaRepository;
import com.jessica.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado " + id
				+	", Tipo: " + Categoria.class.getName());
		}
		
		return obj;
	}
	
}
