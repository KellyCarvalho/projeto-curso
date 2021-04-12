package com.example.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursospring.domain.Categoria;
import com.example.cursospring.repositories.CategoriaRepository;
import com.example.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Optional<Categoria> buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
		if(obj.equals(obj.empty())) {
			throw new ObjectNotFoundException("Não encontrado. id: "+id+" Tipo: "+Categoria.class.getName());
		}
		return obj;
	
		
	
	}

}
