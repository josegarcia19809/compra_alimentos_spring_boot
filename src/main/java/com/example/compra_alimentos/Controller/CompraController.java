package com.example.compra_alimentos.Controller;

import com.example.compra_alimentos.model.CompraComida;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CompraController {
    List<CompraComida> listaCompras = Arrays.asList(
            new CompraComida("Wanda", "Female", "Stamford",
                    "Weekly", "Burger", 15.66),
            new CompraComida("Eric", "Male", "Stamford",
                    "Weekly", "Chalupa", 10.56),
            new CompraComida("Charles", "Male", "Stamford",
                    "Weekly", "Sushi", 42.14),
            new CompraComida("Anna", "Female", "Stamford",
                    "Weekly", "Ice cream", 11.01)
            );

    @GetMapping("/obtener-las-compras")
    public String obtenerLasCompras(Model model) {
        model.addAttribute("listaCompras", listaCompras);
        return "obtener-las-compras";
    }
}
