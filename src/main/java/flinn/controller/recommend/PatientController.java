package flinn.controller.recommend;

import flinn.service.PatientService;
import io.swagger.api.PatientsApi;
import io.swagger.model.PatientDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class PatientController implements PatientsApi {

    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @Override
    public ResponseEntity<List<PatientDto>> patientsGet() {
        return new ResponseEntity<>(patientService.getPatientsData(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PatientDto> patientsIdGet(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientService.getPatientData(id));
    }
}
