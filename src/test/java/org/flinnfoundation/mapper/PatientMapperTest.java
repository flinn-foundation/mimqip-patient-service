package org.flinnfoundation.mapper;

import org.flinnfoundation.model.Patient;
import io.swagger.model.PatientDto;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PatientMapperTest {

    private PatientMapper patientMapper = new PatientMapper();

    Patient patient = new Patient();
    Patient patient2 = new Patient();

    List<Patient> patients = new ArrayList<>();

    @Before
    public void setUp() throws Exception {

        patient.setId(12345);
        patient.setFirstName(RandomStringUtils.random(12));
        patient.setLastName(RandomStringUtils.random(12));
        patient.setDateOfBirth(LocalDate.of(1990, 12, 8));
        patient.setSex(Patient.PatientSex.MALE);
        patient.setValid(true);


        patient2.setId(9876);
        patient2.setFirstName(RandomStringUtils.random(12));
        patient2.setLastName(RandomStringUtils.random(12));
        patient2.setDateOfBirth(LocalDate.of(1989, 03, 30));
        patient2.setSex(Patient.PatientSex.FEMALE);
        patient2.setValid(true);

        patients.add(patient);
        patients.add(patient2);


    }

    @Test
    public void patientModelToApiDto() {

        verifyObjectFieldsEqual(patient, patientMapper.convertModelToApiDto(patient));
    }

    @Test
    public void patientModelListToApiDtoList() {

        List<PatientDto> patientDtos = patientMapper.convertModelToApiDto(patients);
        for (int i = 0; i < patientDtos.size(); i++) {
            verifyObjectFieldsEqual(patients.get(i), patientDtos.get(i));
        }
    }

    private void verifyObjectFieldsEqual(Patient patient, PatientDto patientDto) {
        assertEquals(patient.getId(), (long) patientDto.getId());
        assertEquals(patient.getFirstName(), patientDto.getFirstName());
        assertEquals(patient.getLastName(), patientDto.getLastName());
        assertEquals(patient.getDateOfBirth(), patientDto.getDateOfBirth());
        assertEquals(patient.getSex().name(), patientDto.getSex().name());
        assertEquals(patient.isValid(), patientDto.getValid());
    }

}
