package com.consulta.api_consultas.service;

import org.springframework.stereotype.Service;

import com.consulta.api_consultas.model.Doctor;
import com.consulta.api_consultas.repository.DoctorRepository;

@Service
public class DoctorService {
    private DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository){
        this.doctorRepository = doctorRepository;
    }

    public Doctor criaDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    
}
