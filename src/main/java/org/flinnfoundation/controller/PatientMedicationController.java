package org.flinnfoundation.controller;

import io.swagger.api.MedicationsApi;
import io.swagger.model.PatientMedicationDto;
import org.flinnfoundation.mapper.PatientMedicationMapper;
import org.flinnfoundation.service.PatientMedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientMedicationController implements MedicationsApi {

    private PatientMedicationService patientMedicationService;
    private PatientMedicationMapper patientMedicationMapper;

    @Autowired
    public PatientMedicationController(PatientMedicationService patientMedicationService, PatientMedicationMapper patientMedicationMapper) {
        this.patientMedicationService = patientMedicationService;
        this.patientMedicationMapper = patientMedicationMapper;
    }

    @Override
    public ResponseEntity<PatientMedicationDto> getPatientMedicationsByPatientId(Long patientId) {
        return null;
    }
}
