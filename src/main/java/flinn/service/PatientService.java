package flinn.service;

import flinn.mapper.PatientMapper;
import flinn.model.PatientDetail;
import flinn.model.PatientDetailNew;
import flinn.model.PatientNew;
import flinn.repository.NewPatientRepository;
import flinn.repository.PatientRepository;
import flinn.repository.PatientStatusRepository;
import io.swagger.model.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class PatientService {

    private PatientRepository patientRepository;
    private NewPatientRepository newPatientRepository;
    private PatientStatusRepository patientStatusRepository;

    private PatientMapper patientConverter;

    @Autowired
    public PatientService(PatientRepository patientRepository, NewPatientRepository newPatientRepository, PatientStatusRepository patientStatusRepository, PatientMapper patientConverter) {
        this.patientRepository = patientRepository;
        this.newPatientRepository = newPatientRepository;
        this.patientStatusRepository = patientStatusRepository;
        this.patientConverter = patientConverter;
    }

    public List<Patient> getPatientsData() {

        migratePatientData();

//        StreamSupport.stream(patientRepository.findAll().spliterator(), false).forEach(patient -> log.info(patient.toString()));
//        return patientConverter.entityToApiModel(patientRepository.findAll());
        return Arrays.asList();
    }

    public Patient getPatientData(Long patientId) {
        return patientConverter.entityToApiModel(patientRepository.findOne(patientId));
    }

    private void migratePatientData() {
        Iterable<flinn.model.Patient> patients = patientRepository.findAll();

        List<PatientNew> patientNewList = new ArrayList<>((int) patients.spliterator().estimateSize());

        for (flinn.model.Patient patient : patients) {
            PatientNew patientNew = new PatientNew();
            PatientDetailNew patientDetailNew = new PatientDetailNew();

            patientNew.setId(patient.getId());
            patientNew.setFacilityId(patient.getFacilityId());
            patientNew.setValid(patient.isValid());
            patientNew.setStartDate(patient.getStartDate());
            patientNew.setRcopiaLastUpdatedDate(patient.getRcopiaLastUpdatedDate());



            for (PatientDetail patientDetail : patient.getPatientDetails()) {
                if (patientDetail.getKey().equals("firstname")) {
                    patientDetailNew.setEntryDate(patientDetail.getEntryDate());
                    patientDetailNew.setFirstName(patientDetail.getValue());
                } else if (patientDetail.getKey().equals("lastname"))
                    patientDetailNew.setLastName(patientDetail.getValue());
                else if (patientDetail.getKey().equals("birth"))
                    patientDetailNew.setDateOfBirth(LocalDate.parse(patientDetail.getValue()));
                else if (patientDetail.getKey().equals("employment"))
                    patientDetailNew.setEmployment(patientDetail.getValue());
                else if (patientDetail.getKey().equals("ethnicity"))
                    patientDetailNew.setEthnicity(patientDetail.getValue());
                else if (patientDetail.getKey().equals("living"))
                    patientDetailNew.setLiving(patientDetail.getValue());
                else if (patientDetail.getKey().equals("marital"))
                    patientDetailNew.setMarital(patientDetail.getValue());
                else if (patientDetail.getKey().equals("patientidentifier"))
                    patientDetailNew.setPatientIdentifier(patientDetail.getValue());
                else if (patientDetail.getKey().equals("physicianname"))
                    patientDetailNew.setPhysicianName(patientDetail.getValue());
                else if (patientDetail.getKey().equals("physicianemail")) {
                    patientDetailNew.setPhysicianEmail(patientDetail.getValue());
                }
                else if (patientDetail.getKey().equals("race"))
                    patientDetailNew.setRace(patientDetail.getValue());
                else if (patientDetail.getKey().equals("sex"))
                    patientDetailNew.setSex(patientDetail.getValue());
                else if (patientDetail.getKey().equals("zip"))
                    patientDetailNew.setZipCode(patientDetail.getValue());
                else if (patientDetail.getKey().equals("zip"))
                    patientDetailNew.setZipCode(patientDetail.getValue());
            }

            patientNew.setPatientDetailNew(patientDetailNew);
            patientNewList.add(patientNew);
        }

        newPatientRepository.save(patientNewList);
    }


}
