package com.example.compra_alimentos.model;

import com.example.compra_alimentos.Controller.Articulo;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;


public class CompraComida {
    @NotBlank(message = "El nombre no debe estar vacío")
    private String nombre;
    @NotBlank(message = "El género no debe estar vacío")
    private String genero;
    private String ciudad;
    private String frecuencia;
    @Articulo(message = "Articulo debe ser Tacos, Tortas o Quesadillas")
    private String articulo;
    private double gasto;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CompraComida(String nombre, String genero, String ciudad, String frecuencia,
                        String articulo, double gasto) {
        this.nombre = nombre;
        this.genero = genero;
        this.ciudad = ciudad;
        this.frecuencia = frecuencia;
        this.articulo = articulo;
        this.gasto = gasto;
        this.id = UUID.randomUUID().toString();
    }

    public CompraComida() {
        this.id = UUID.randomUUID().toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return "CompraComida{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", articulo='" + articulo + '\'' +
                ", gasto=" + gasto +
                '}';
    }
}
