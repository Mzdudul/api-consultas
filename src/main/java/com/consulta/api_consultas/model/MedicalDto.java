package com.consulta.api_consultas.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalDto {
    @NotNull
    private Long doctorId;

    @NotNull
    private Long patientId;

    @NotNull
    private LocalDateTime dataHora;
}
