package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.PatientMedicationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-11T00:38:15.354-04:00")

@Api(value = "medications", description = "the medications API")
public interface MedicationsApi {

    @ApiOperation(value = "Get all medications for patient", notes = "Get all medications for patient", response = PatientMedicationDto.class, tags={ "medication", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Patient", response = PatientMedicationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PatientMedicationDto.class) })
    @RequestMapping(value = "/medications",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<PatientMedicationDto> getPatientMedicationsByPatientId(@NotNull @ApiParam(value = "ID of patient to fetch", required = true) @RequestParam(value = "patientId", required = true) Long patientId);

}
