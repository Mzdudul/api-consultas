package com.consulta.api_consultas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consulta.api_consultas.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>  {
    
}
