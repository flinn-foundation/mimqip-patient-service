package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.PatientDto;
import io.swagger.model.PatientSimpleDto;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-24T22:30:53.710-04:00")

@Api(value = "Patient", description = "the Patient API")
public interface PatientApi {

    @ApiOperation(value = "Post new patient", notes = "Post new patient", response = String.class, tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Patient", response = String.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> createPatient(@ApiParam(value = "Patient to add" ,required=true ) @RequestBody PatientDto patient) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }


    @ApiOperation(value = "Patient by ID", notes = "Access a single patient by ID", response = PatientDto.class, tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Patient", response = PatientDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PatientDto.class) })
    @RequestMapping(value = "/patients/{patientId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<PatientDto> getPatientById(@ApiParam(value = "ID of patient to fetch",required=true ) @PathVariable("patientId") Long patientId) {
        // do some magic!
        return new ResponseEntity<PatientDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Patient Simple", notes = "Patient Simple", response = PatientSimpleDto.class, tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "PatientSimple", response = PatientSimpleDto.class) })
    @RequestMapping(value = "/patients/{patientId}/simple",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<PatientSimpleDto> getPatientSimpleById(@ApiParam(value = "ID of patient to fetch",required=true ) @PathVariable("patientId") Long patientId) {
        // do some magic!
        return new ResponseEntity<PatientSimpleDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Patients", notes = "Endpoint returns a list of patients", response = PatientDto.class, responseContainer = "List", tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Array of patients", response = PatientDto.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<PatientDto>> getPatients() {
        // do some magic!
        return new ResponseEntity<List<PatientDto>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Patients Simple", notes = "Patients Simple", response = PatientSimpleDto.class, responseContainer = "List", tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Array of simple patients", response = PatientSimpleDto.class) })
    @RequestMapping(value = "/patients/simple",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<PatientSimpleDto>> getPatientsSimple() {
        // do some magic!
        return new ResponseEntity<List<PatientSimpleDto>>(HttpStatus.OK);
    }

}
