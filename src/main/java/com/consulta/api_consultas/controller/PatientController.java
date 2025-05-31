package com.consulta.api_consultas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.api_consultas.model.Patient;
import com.consulta.api_consultas.service.PatientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/patient")
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @PostMapping()
    public Patient salvarPatient(@RequestBody Patient patient) {
        return patientService.criarPatient(patient);
    }
    
}
