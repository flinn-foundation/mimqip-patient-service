package flinn.service;

import flinn.mapper.PatientMapper;
import flinn.repository.PatientRepository;
import io.swagger.model.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PatientService {

    /*
    * TODO: Create add patient details see {ResponsePatientBean}
    *
    */

    private PatientRepository patientRepository;
    private PatientMapper patientConverter;

    @Autowired
    public PatientService(PatientRepository patientRepository, PatientMapper patientConverter) {
        this.patientRepository = patientRepository;
        this.patientConverter = patientConverter;
    }

    public List<Patient> getPatientsData() {
        return patientConverter.entityToApiModel(patientRepository.findAll());
    }

    public Patient getPatientData(Long patientId) {
        return patientConverter.entityToApiModel(patientRepository.findOne(patientId));
    }


}
