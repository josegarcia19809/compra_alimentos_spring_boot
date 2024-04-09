package com.example.compra_alimentos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientesController {
    @GetMapping(value = "/mostrar-clientes")
    public String mostrarClientes() {
        return "mostrar_clientes";
    }

    @GetMapping(value = "/")
    public String mostrarIndex() {
        return "index";
    }
}
