package org.flinnfoundation.service;

import org.flinnfoundation.model.Diagnosis;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.repository.DiagnosisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosisService {

    private DiagnosisRepository diagnosisRepository;
    private PatientService patientService;

    @Autowired
    public DiagnosisService(DiagnosisRepository diagnosisRepository, PatientService patientService) {
        this.diagnosisRepository = diagnosisRepository;
        this.patientService = patientService;
    }

    public List<Diagnosis> getDiagnosesByPatientId(Long patientId) {
        Patient patient = patientService.getPatient(patientId);
        return diagnosisRepository.findDiagnosesByPatientOrderByCreatedTimestampDesc(patient);
    }

    public Diagnosis getMostRecentDiagnosisByPatientId(Long patientId) {
        Patient patient = patientService.getPatient(patientId);
        return diagnosisRepository.findTopByPatientOrderByCreatedTimestampDesc(patient);
    }

    public Diagnosis saveDiagnosis(Diagnosis diagnosis) {
        return diagnosisRepository.save(diagnosis);
    }
}
