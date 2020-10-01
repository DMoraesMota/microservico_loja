package br.com.diego.microservices.loja.model;

public class Compra {

	private Long pedidoId;
	
	private Integer tempoDePreaparo;
	
	private String enderecoDestino;

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreaparo() {
		return tempoDePreaparo;
	}

	public void setTempoDePreaparo(Integer tempoDePreaparo) {
		this.tempoDePreaparo = tempoDePreaparo;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	
	
	
}
