package org.flinnfoundation.service;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.exception.PatientNotFoundException;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PatientService {

    private PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getPatients() {

        return Lists.newArrayList(patientRepository.findAll());
    }

    public Patient getPatient(Long patientId) {
        Patient patient = patientRepository.findOne(patientId);
        if(patient == null) {
            throw new PatientNotFoundException("Unable to locate patient with ID: " + patientId);
        }

        return patient;
    }

    public Patient createPatient(Patient patient) {

        return patientRepository.save(patient);
    }

}
