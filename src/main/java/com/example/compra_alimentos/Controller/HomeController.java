package com.example.compra_alimentos.Controller;

import com.example.compra_alimentos.model.CompraComida;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    List<CompraComida> listaCompras = new ArrayList<>();

    @GetMapping("/detalle")
    public String mostrarDetalle(Model model) {
        CompraComida compra = new CompraComida("Wanda", "Female", "Stamford", "Weekly",
                "Burger ", 15.66);
        model.addAttribute("compra", compra);
        return "detalle";
    }

    @GetMapping("/genero")
    public String mostrarGenero(Model model) {
        CompraComida compra = new CompraComida("Rachel", "Male",
                "Philadelphia",
                "Seldom", "Sushi", 71.68);
        model.addAttribute("compra", compra);
        return "genero";
    }

    @GetMapping("/frecuencia")
    public String mostrarFrecuencia(Model model) {
        CompraComida compra = new CompraComida("Sharon", "Female", "New York", "Seldom",
                "Donut", 25.04);
        model.addAttribute("compra", compra);
        return "frecuencia";
    }

    @GetMapping("/obtener-compras")
    public String obtenerCompras(Model model) {
        model.addAttribute("listaCompras", listaCompras);
        return "obtener_compras";
    }

    @GetMapping("/registrar-compra")
    public String registrarCompra(Model model) {
        model.addAttribute("compra", new CompraComida());
        return "form_registrar_compra";
    }

    @PostMapping("/guardarCompra")
    public String guardarCompra(CompraComida compra) {
        System.out.println(compra);
        listaCompras.add(compra);
        return "redirect:/obtener-compras";
    }

}
