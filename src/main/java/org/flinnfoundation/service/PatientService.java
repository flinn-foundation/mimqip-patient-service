package org.flinnfoundation.service;

import io.swagger.model.PatientDto;
import lombok.extern.slf4j.Slf4j;
import org.flinnfoundation.mapper.PatientMapper;
import org.flinnfoundation.model.Patient;
import org.flinnfoundation.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PatientService {

    private PatientRepository patientRepository;

    private PatientMapper patientMapper;

    @Autowired
    public PatientService(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.patientRepository = patientRepository;
        this.patientMapper = patientMapper;
    }

    public List<PatientDto> getPatientsData() {

        return patientMapper.convertModelToApiDto(patientRepository.findAll());
    }

    public PatientDto getPatientData(Long patientId) {
        return patientMapper.convertModelToApiDto(patientRepository.findOne(patientId));
    }

    public void createPatient(PatientDto patientDto) {
        Patient patient = patientMapper.convertApiDtoToModel(patientDto);

        patientRepository.save(patient);
    }

}
