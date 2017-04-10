package org.flinnfoundation.controller;

import io.swagger.api.PatientsApi;
import io.swagger.model.EvaluationDto;
import io.swagger.model.PatientDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.mapper.PatientMapper;
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
    private PatientMapper patientMapper;

    @Autowired
    public PatientController(PatientService patientService, PatientMapper patientMapper) {
        this.patientService = patientService;
        this.patientMapper = patientMapper;
    }

    @Override
    public ResponseEntity<List<PatientDto>> getPatients() {
        return new ResponseEntity<>(patientMapper.convertModelToApiDto(patientService.getPatients()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PatientDto> getPatientById(@PathVariable Long patientId) {
        return ResponseEntity.ok(patientMapper.convertModelToApiDto(patientService.getPatient(patientId)));
    }

    @Override
    public ResponseEntity<EvaluationDto> createPatient(@RequestBody PatientDto patient) {

        patientService.createPatient(patientMapper.convertApiDtoToModel(patient));

        return null;

    }
}
