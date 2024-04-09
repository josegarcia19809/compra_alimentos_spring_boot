package com.example.compra_alimentos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilidadController {
    @GetMapping(value = "/convertir-a-mayusculas")
    public String convertirAMayusculas(Model model) {
        model.addAttribute("mensaje", "Análisis de compras de alimentos");
        model.addAttribute("nombre", "José García");
        return "convertir_a_mayusculas";
    }
}
