package com.example.compra_alimentos.Controller;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class ArticuloValidator implements ConstraintValidator<Articulo, String> {

    List<String> articulos = Arrays.asList(
            "Tacos", "Tortas", "Quesadillas"
    );

    @Override
    public boolean isValid(String value,
                           ConstraintValidatorContext constraintValidatorContext) {
        for (String articulo : articulos) {
            if (value.equalsIgnoreCase(articulo)) {
                return true;
            }
        }
        return false;
    }
}
