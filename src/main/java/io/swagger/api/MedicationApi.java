package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.PatientMedicationDto;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-01T09:57:31.870-04:00")

@Api(value = "Medication", description = "the Medication API")
public interface MedicationApi {

    @ApiOperation(value = "Get all medications for patient", notes = "Get all medications for patient", response = PatientMedicationDto.class, tags={ "medication", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Patient", response = PatientMedicationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PatientMedicationDto.class) })
    @RequestMapping(value = "/medications",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<PatientMedicationDto> getPatientMedicationsByPatientId( @NotNull @ApiParam(value = "ID of patient to fetch", required = true) @RequestParam(value = "patientId", required = true) Long patientId) {
        // do some magic!
        return new ResponseEntity<PatientMedicationDto>(HttpStatus.OK);
    }

}
