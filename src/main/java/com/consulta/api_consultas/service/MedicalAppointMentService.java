package com.consulta.api_consultas.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.consulta.api_consultas.model.Doctor;
import com.consulta.api_consultas.model.MedicalAppointment;

import com.consulta.api_consultas.model.Patient;
import com.consulta.api_consultas.repository.DoctorRepository;
import com.consulta.api_consultas.repository.MedicalAppointmentRepository;
import com.consulta.api_consultas.repository.PatientRepository;

@Service
public class MedicalAppointMentService {

    private final DoctorRepository doctorRepository;

    private final PatientRepository patientRepository;
    private MedicalAppointmentRepository medicalAppointmentRepository;

    public MedicalAppointMentService(MedicalAppointmentRepository medicalAppointmentRepository,PatientRepository patientRepository, DoctorRepository doctorRepository){
        this.medicalAppointmentRepository = medicalAppointmentRepository;
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
    }

    public MedicalAppointment criarAppointment(MedicalAppointment appointment, Long patientId, Long doctorId) {
    Patient patient = patientRepository.findById(patientId)
        .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
    
    Doctor doctor = doctorRepository.findById(doctorId)
        .orElseThrow(() -> new RuntimeException("Médico não encontrado"));
    
    appointment.setPatient(patient);
    appointment.setDoctor(doctor);

    return medicalAppointmentRepository.save(appointment);
}
    public List<MedicalAppointment> listarAppointment(){
        return medicalAppointmentRepository.findAll();
    }
}
