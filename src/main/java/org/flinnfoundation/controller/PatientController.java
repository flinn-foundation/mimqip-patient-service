package org.flinnfoundation.controller;

import io.swagger.api.PatientsApi;
import io.swagger.model.EvaluationDto;
import io.swagger.model.PatientDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class PatientController implements PatientsApi {

    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @Override
    public ResponseEntity<List<PatientDto>> getPatients() {
        return new ResponseEntity<>(patientService.getPatientsData(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PatientDto> getPatientById(@PathVariable Long patientId) {
        return ResponseEntity.ok(patientService.getPatientData(patientId));
    }

    @Override
    public ResponseEntity<EvaluationDto> createPatient(@RequestBody PatientDto patient) {

        patientService.createPatient(patient);

        return null;

    }
}
