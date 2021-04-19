package com.example.cursospring.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cursospring.domain.Pagamento;
import com.example.cursospring.domain.PagamentoComCartao;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
