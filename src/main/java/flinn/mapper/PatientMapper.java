package flinn.mapper;

import flinn.model.Patient;
import io.swagger.model.PatientDto;
import org.springframework.stereotype.Component;


@Component
public class PatientMapper extends OrikaMapper<Patient, PatientDto> {

    protected PatientMapper() {
        super(Patient.class, PatientDto.class);
    }
}
