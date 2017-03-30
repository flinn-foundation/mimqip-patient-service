package flinn.service;

import flinn.mapper.PatientMapper;
import flinn.repository.PatientRepository;
import flinn.repository.PatientStatusRepository;
import io.swagger.model.PatientDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PatientService {

    private PatientRepository patientRepository;
    private PatientStatusRepository patientStatusRepository;

    private PatientMapper patientConverter;

    @Autowired
    public PatientService(PatientRepository patientRepository, PatientStatusRepository patientStatusRepository, PatientMapper patientConverter) {
        this.patientRepository = patientRepository;
        this.patientStatusRepository = patientStatusRepository;
        this.patientConverter = patientConverter;
    }

    public List<PatientDto> getPatientsData() {

        return patientConverter.convertModelToApiDto(patientRepository.findAll());
    }

    public PatientDto getPatientData(Long patientId) {
        return patientConverter.convertModelToApiDto(patientRepository.findOne(patientId));
    }

}
