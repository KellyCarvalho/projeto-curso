package com.example.cursospring.domain;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class ItemPedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@EmbeddedId
	private ItemPedidoPk id= new ItemPedidoPk();
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	public ItemPedido() {
		super();
	}
	public ItemPedido(Pedido pedido, Produtos produto, Double desconto, Integer quantidade, Double preco) {
		super();
		this.id = id;
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
		id.setPedido(pedido);
		id.setProduto(produto);
	}
	@JsonIgnore
	public Pedido getPedido() {
		return id.getPedido();
		
	}
	
	public Produtos getProduto() {
		return id.getProduto();
		
	}
	public ItemPedidoPk getId() {
		return id;
	}
	public Double getDesconto() {
		return desconto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setId(ItemPedidoPk id) {
		this.id = id;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
