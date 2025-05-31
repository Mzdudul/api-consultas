package com.consulta.api_consultas.excecoes;

public class PatientOrDoctorWithTheseDataNotFoundException extends RuntimeException {
    public PatientOrDoctorWithTheseDataNotFoundException(String mensagem){
        super(mensagem);
    }
}
