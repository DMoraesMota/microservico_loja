package br.com.diego.microservices.loja.service;

import br.com.diego.microservices.loja.DTO.CompraDTO;
import br.com.diego.microservices.loja.DTO.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compra){

        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://fornecedor/info/" + compra.getEndereco().getEstado(),
                                                                        HttpMethod.GET,
                                                                        null,
                                                                        InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());
    }
}
