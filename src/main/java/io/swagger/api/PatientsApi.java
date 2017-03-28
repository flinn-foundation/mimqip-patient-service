package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-27T14:18:48.125-04:00")

@Api(value = "patients", description = "the patients API")
public interface PatientsApi {

    @ApiOperation(value = "Patients", notes = "Endpoint returns a list of patients", response = Patient.class, responseContainer = "List", tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Array of rules", response = Patient.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Patient>> patientsGet() {
        // do some magic!
        return new ResponseEntity<List<Patient>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Patient by ID", notes = "Access a single patient by ID", response = Patient.class, tags={ "patient", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Rule", response = Patient.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Patient.class) })
    @RequestMapping(value = "/patients/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Patient> patientsIdGet(@ApiParam(value = "ID of rule to fetch", required = true) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Patient>(HttpStatus.OK);
    }

}
