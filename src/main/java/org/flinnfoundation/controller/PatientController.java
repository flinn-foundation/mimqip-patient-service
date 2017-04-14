package org.flinnfoundation.controller;

import io.swagger.api.PatientApi;
import io.swagger.model.PatientDto;
import io.swagger.model.PatientSimpleDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.mapper.PatientMapper;
import org.flinnfoundation.mapper.PatientSimpleMapper;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class PatientController implements PatientApi {

    private PatientService patientService;
    private PatientMapper patientMapper;
    private PatientSimpleMapper patientSimpleMapper;

    @Autowired
    public PatientController(PatientService patientService, PatientMapper patientMapper, PatientSimpleMapper patientSimpleMapper) {
        this.patientService = patientService;
        this.patientMapper = patientMapper;
        this.patientSimpleMapper = patientSimpleMapper;
    }

    @Override
    public ResponseEntity<List<PatientDto>> getPatients() {
        return ResponseEntity.ok(patientMapper.convertModelToApiDto(patientService.getPatients()));
    }

    @Override
    public ResponseEntity<PatientDto> getPatientById(@PathVariable Long patientId) {
        return ResponseEntity.ok(patientMapper.convertModelToApiDto(patientService.getPatient(patientId)));
    }

    @Override
    public ResponseEntity<List<PatientSimpleDto>> getPatientsSimple() {
        return ResponseEntity.ok(patientSimpleMapper.convertModelToApiDto(patientService.getPatients()));
    }

    @Override
    public ResponseEntity<PatientSimpleDto> getPatientSimpleById(@PathVariable Long patientId) {
        return ResponseEntity.ok(patientSimpleMapper.convertModelToApiDto(patientService.getPatient(patientId)));
    }

    @Override
    public ResponseEntity<String> createPatient(@RequestBody PatientDto patientDto) {

        Patient patient = patientService.createPatient(patientMapper.convertApiDtoToModel(patientDto));

        return ResponseEntity.ok(Long.toString(patient.getId()));

    }
}
