package com.consulta.api_consultas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consulta.api_consultas.model.MedicalAppointment;

public interface MedicalAppointmentRepository extends JpaRepository<MedicalAppointment, Long> {
    
}
