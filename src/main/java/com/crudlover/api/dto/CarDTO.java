package com.crudlover.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record CarDTO(
    
@NotBlank String modelo,

@NotBlank String fabricante, 

@NotBlank String dataFabricacao, 

@PositiveOrZero int valor, 

@PositiveOrZero int anoModelo) {
}
