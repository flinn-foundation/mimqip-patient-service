package org.flinnfoundation.controller;

import io.swagger.api.DiagnosisApi;
import io.swagger.model.DiagnosisDto;
import org.flinnfoundation.mapper.DiagnosisMapper;
import org.flinnfoundation.model.Diagnosis;
import org.flinnfoundation.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiagnosisController implements DiagnosisApi {

    private DiagnosisService diagnosisService;
    private DiagnosisMapper diagnosisMapper;

    @Autowired
    public DiagnosisController(DiagnosisService diagnosisService, DiagnosisMapper diagnosisMapper) {
        this.diagnosisService = diagnosisService;
        this.diagnosisMapper = diagnosisMapper;
    }

    @Override
    public ResponseEntity<DiagnosisDto> getMostRecentDiagnosisByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(diagnosisMapper.convertModelToApiDto(diagnosisService.getMostRecentDiagnosisByPatientId(patientId)));
    }

    @Override
    public ResponseEntity<List<DiagnosisDto>> getDiagnosesByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(diagnosisMapper.convertModelToApiDto(diagnosisService.getDiagnosesByPatientId(patientId)));
    }

    @Override
    public ResponseEntity<String> savePatientDiagnosis(@PathVariable Long patientId, @RequestBody DiagnosisDto diagnosisDto) {

        diagnosisDto.setPatientId(patientId);
        Diagnosis diagnosis = diagnosisService.saveDiagnosis(diagnosisMapper.convertApiDtoToModel(diagnosisDto));

        return ResponseEntity.ok(Long.toString(diagnosis.getId()));
    }
}
