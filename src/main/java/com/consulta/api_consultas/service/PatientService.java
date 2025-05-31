package com.consulta.api_consultas.service;

import org.springframework.stereotype.Service;

import com.consulta.api_consultas.model.Patient;
import com.consulta.api_consultas.repository.PatientRepository;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public Patient criarPatient(Patient patient){
        return patientRepository.save(patient);
    }
}
