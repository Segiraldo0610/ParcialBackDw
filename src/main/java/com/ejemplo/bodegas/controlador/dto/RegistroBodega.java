package com.ejemplo.bodegas.controlador.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegistroBodega(
        @NotBlank @Size(max = 255) String nombre,
        @NotBlank @Size(max = 255) String ubicacion) {}
