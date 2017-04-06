package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.EvaluationDto;
import io.swagger.model.PatientDto;

import io.swagger.annotations.*;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-06T12:19:13.321-04:00")

@Api(value = "patients", description = "the patients API")
public interface PatientsApi {

    @ApiOperation(value = "Post new patient", notes = "Post new patient", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Evaluation", response = EvaluationDto.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<EvaluationDto> createPatient(@ApiParam(value = "Patient to add" ,required=true ) @RequestBody PatientDto patient);


    @ApiOperation(value = "Patient by ID", notes = "Access a single patient by ID", response = PatientDto.class, tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Patient", response = PatientDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PatientDto.class) })
    @RequestMapping(value = "/patients/{patientId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PatientDto> getPatientById(@ApiParam(value = "ID of patient to fetch",required=true ) @PathVariable("patientId") Long patientId);


    @ApiOperation(value = "Patients", notes = "Endpoint returns a list of patients", response = PatientDto.class, responseContainer = "List", tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Array of patients", response = PatientDto.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PatientDto>> getPatients();

}
