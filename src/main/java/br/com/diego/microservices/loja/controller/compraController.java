package br.com.diego.microservices.loja.controller;

import br.com.diego.microservices.loja.DTO.CompraDTO;
import br.com.diego.microservices.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class compraController {

    @Autowired
    private CompraService compraService;

    @RequestMapping(method = RequestMethod.POST)
    public void realizaCompra(@RequestBody CompraDTO compra){
        compraService.realizaCompra(compra);
    }

}
