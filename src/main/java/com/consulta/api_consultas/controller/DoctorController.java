package com.consulta.api_consultas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.api_consultas.model.Doctor;
import com.consulta.api_consultas.service.DoctorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService){
        this.doctorService = doctorService;
    }

    @PostMapping()
    public Doctor salvaDoctor(@RequestBody Doctor doctor) {
        return doctorService.criaDoctor(doctor);
    }
    
}
