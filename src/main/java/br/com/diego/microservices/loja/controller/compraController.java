package br.com.diego.microservices.loja.controller;

import br.com.diego.microservices.loja.DTO.CompraDTO;
import br.com.diego.microservices.loja.model.Compra;
import br.com.diego.microservices.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class compraController {

    @Autowired
    private CompraService compraService;

    @RequestMapping(method = RequestMethod.POST)
    public Compra realizaCompra(@RequestBody CompraDTO compra){
        return compraService.realizaCompra(compra);
    }

}
