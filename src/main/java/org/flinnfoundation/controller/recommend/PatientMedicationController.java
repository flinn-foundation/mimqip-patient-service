package org.flinnfoundation.controller.recommend;

import io.swagger.api.MedicationsApi;
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
    public ResponseEntity<Void> getPatientMedicationsByPatientId(Long patientId) {

        patientMedicationMapper.convertModelToApiDto(patientMedicationService.getPatientMedications(patientId));
        return null;
    }
}
