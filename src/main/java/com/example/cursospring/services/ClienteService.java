package com.example.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursospring.domain.Cliente;
import com.example.cursospring.repositories.ClienteRepository;
import com.example.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	
	public Optional<Cliente> buscar(Integer id) {
		
		Optional<Cliente> obj = repo.findById(id);
		
		if(obj.equals(obj.empty())) {
			throw new ObjectNotFoundException("Não encontrado. id: "+id+" Tipo: "+Cliente.class.getName());
		}
		return obj;
	
		
	
	}

}
