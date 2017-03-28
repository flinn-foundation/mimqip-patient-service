package flinn.mapper;

import flinn.model.Patient;
import org.springframework.stereotype.Component;


@Component
public class PatientMapper extends OrikaMapper<Patient, io.swagger.model.Patient> {

    protected PatientMapper() {
        super(Patient.class, io.swagger.model.Patient.class);
    }
}
