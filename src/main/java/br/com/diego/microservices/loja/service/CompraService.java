package br.com.diego.microservices.loja.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diego.microservices.loja.DTO.CompraDTO;
import br.com.diego.microservices.loja.DTO.InfoFornecedorDTO;
import br.com.diego.microservices.loja.DTO.InfoPedidoDTO;
import br.com.diego.microservices.loja.client.fornecedorClient;
import br.com.diego.microservices.loja.model.Compra;
import jdk.internal.org.jline.utils.Log;

import org.slf4j.LoggerFactory;


@Service
public class CompraService {
	
	private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);

	@Autowired
	private fornecedorClient fornecedorClient;
	
    public Compra realizaCompra(CompraDTO compra){
    	
    	final String estado = compra.getEndereco().getEstado();
    	
    	LOG.info("Buscando informações do fornecedor de {} ", estado);
    	InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(estado);
    	    	
    	LOG.info("realizando um pedido");
    	InfoPedidoDTO pedido = fornecedorClient.realizaPedido(compra.getItens());
    	
        System.out.println(info.getEndereco());
        
        Compra compraSalva = new Compra();
        compraSalva.setPedidoId(pedido.getId());
        compraSalva.setTempoDePreaparo(pedido.getTempoDePreparo());
        compraSalva.setEnderecoDestino(compra.getEndereco().toString());
        
        return compraSalva;
    }
}
