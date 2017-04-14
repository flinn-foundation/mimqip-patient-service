package org.flinnfoundation.mapper;


import io.swagger.model.PatientMedicationDto;
import org.flinnfoundation.model.PatientMedication;
import org.springframework.stereotype.Component;


@Component
public class PatientMedicationMapper extends OrikaMapper<PatientMedication, PatientMedicationDto> {

    protected PatientMedicationMapper() {
        super(PatientMedication.class, PatientMedicationDto.class);
    }
}
