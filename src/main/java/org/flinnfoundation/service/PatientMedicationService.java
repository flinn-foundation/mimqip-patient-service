package org.flinnfoundation.service;

import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.PatientMedication;
import org.flinnfoundation.repository.PatientMedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PatientMedicationService {

    private PatientService patientService;
    private PatientMedicationRepository patientMedicationRepository;


    @Autowired
    public PatientMedicationService(PatientService patientService) {
        this.patientService = patientService;
    }


    public List<PatientMedication> getPatientMedications(long patientId) {
        Patient patient = patientService.getPatient(patientId);

        return patientMedicationRepository.findPatientMedicationByPatient(patient);
    }

    public void addPatientMedication(PatientMedication patientMedication) {

        patientMedicationRepository.save(patientMedication);
    }

}
