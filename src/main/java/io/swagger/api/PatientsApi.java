package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.PatientDto;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-30T15:14:24.034-04:00")

@Api(value = "patients", description = "the patients API")
public interface PatientsApi {

    @ApiOperation(value = "Patients", notes = "Endpoint returns a list of patients", response = PatientDto.class, responseContainer = "List", tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Array of rules", response = PatientDto.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<PatientDto>> patientsGet() {
        // do some magic!
        return new ResponseEntity<List<PatientDto>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Patient by ID", notes = "Access a single patient by ID", response = PatientDto.class, tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Patient", response = PatientDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PatientDto.class) })
    @RequestMapping(value = "/patients/{id}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<PatientDto> patientsIdGet(@ApiParam(value = "ID of rule to fetch", required = true) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<PatientDto>(HttpStatus.OK);
    }

}
