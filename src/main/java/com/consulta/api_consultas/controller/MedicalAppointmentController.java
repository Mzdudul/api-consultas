package com.consulta.api_consultas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.consulta.api_consultas.model.MedicalAppointment;

import com.consulta.api_consultas.service.MedicalAppointMentService;

import java.util.List;



@RestController
@RequestMapping("/api/appointment")
public class MedicalAppointmentController {
    private final MedicalAppointMentService medicalAppointMentService;

    public MedicalAppointmentController(MedicalAppointMentService medicalAppointMentService) {
        this.medicalAppointMentService = medicalAppointMentService;
    }

    @PostMapping("/patient_id/{patientId}/doctor_id/{doctorId}")
    public MedicalAppointment salvarAppointment(
        @PathVariable Long patientId,
        @PathVariable Long doctorId,
        @RequestBody MedicalAppointment appointment
    ) {
        return medicalAppointMentService.criarAppointment(appointment, patientId, doctorId);
    }

    @GetMapping
    public List<MedicalAppointment> listarConsultas() {
        return medicalAppointMentService.listarAppointment();
    }
}
