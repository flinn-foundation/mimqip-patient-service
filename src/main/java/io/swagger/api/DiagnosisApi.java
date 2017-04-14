package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.DiagnosisDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-14T10:14:35.586-04:00")

@Api(value = "Diagnosis", description = "the Diagnosis API")
public interface DiagnosisApi {

    @ApiOperation(value = "Get diagnoses by patient ID", notes = "Get diagnoses by patient ID", response = DiagnosisDto.class, responseContainer = "List", tags={ "diagnosis", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Diagnoses", response = DiagnosisDto.class) })
    @RequestMapping(value = "/patients/{patientId}/diagnoses",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<DiagnosisDto>> getDiagnosesByPatientId(@ApiParam(value = "ID of patient diagnoses to fetch", required = true) @PathVariable("patientId") Long patientId) {
        // do some magic!
        return new ResponseEntity<List<DiagnosisDto>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get most recent diagnoses by patient ID", notes = "Get most recent diagnoses by patient ID", response = DiagnosisDto.class, tags={ "diagnosis", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Diagnoses", response = DiagnosisDto.class) })
    @RequestMapping(value = "/patients/{patientId}/diagnoses/latest",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<DiagnosisDto> getMostRecentDiagnosisByPatientId(@ApiParam(value = "ID of patient diagnoses to fetch", required = true) @PathVariable("patientId") Long patientId) {
        // do some magic!
        return new ResponseEntity<DiagnosisDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Submit new diagnosis for patient", notes = "Submit new diagnosis for patient", response = String.class, tags={ "diagnosis", })
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Patient updated successfully", response = String.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = String.class) })
    @RequestMapping(value = "/patients/{patientId}/diagnoses",
        produces = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<String> savePatientDiagnosis(@ApiParam(value = "ID of patient to fetch", required = true) @PathVariable("patientId") Long patientId,
                                                        @ApiParam(value = "Diagnosis to add", required = true) @RequestBody DiagnosisDto diagnosis) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
