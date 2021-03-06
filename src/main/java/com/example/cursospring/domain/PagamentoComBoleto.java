package com.example.cursospring.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.cursospring.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComBoleto extends Pagamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento;
	private Date dataPagamento;
	public PagamentoComBoleto() {
		
	}
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento=dataPagamento;
		this.dataVencimento=dataVencimento;

	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


}
