package flinn.service;

import flinn.mapper.PatientMapper;
import flinn.repository.PatientDetailRepository;
import flinn.repository.PatientRepository;
import flinn.repository.PatientStatusRepository;
import io.swagger.model.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PatientService {

    private PatientRepository patientRepository;
    private PatientDetailRepository patientDetailRepository;
    private PatientStatusRepository patientStatusRepository;

    private PatientMapper patientConverter;

    @Autowired
    public PatientService(PatientRepository patientRepository, PatientDetailRepository patientDetailRepository, PatientStatusRepository patientStatusRepository, PatientMapper patientConverter) {
        this.patientRepository = patientRepository;
        this.patientDetailRepository = patientDetailRepository;
        this.patientStatusRepository = patientStatusRepository;
        this.patientConverter = patientConverter;
    }

    public List<Patient> getPatientsData() {
        return patientConverter.entityToApiModel(patientRepository.findAll());
    }

    public Patient getPatientData(Long patientId) {
        return patientConverter.entityToApiModel(patientRepository.findOne(patientId));
    }


}
