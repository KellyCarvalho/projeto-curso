package com.example.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursospring.domain.Pedido;
import com.example.cursospring.repositories.PedidoRepository;
import com.example.cursospring.services.exceptions.ObjectNotFoundException;
@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;
	
	public Optional<Pedido> buscar(Integer id) {
		
		Optional<Pedido> obj = repo.findById(id);
		
		if(obj.equals(obj.empty())) {
			throw new ObjectNotFoundException("Não encontrado. id: "+id+" Tipo: "+Pedido.class.getName());
		}
		return obj;
	
		
	
	}
}
