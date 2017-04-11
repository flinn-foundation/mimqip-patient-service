package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.EvaluationDto;
import io.swagger.model.PatientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-11T00:38:15.354-04:00")

@Api(value = "patients", description = "the patients API")
public interface PatientsApi {

    @ApiOperation(value = "Post new patient", notes = "Post new patient", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Evaluation", response = EvaluationDto.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<EvaluationDto> createPatient(@ApiParam(value = "Patient to add", required = true) @RequestBody PatientDto patient);


    @ApiOperation(value = "Patient by ID", notes = "Access a single patient by ID", response = PatientDto.class, tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Patient", response = PatientDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PatientDto.class) })
    @RequestMapping(value = "/patients/{patientId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<PatientDto> getPatientById(@ApiParam(value = "ID of patient to fetch", required = true) @PathVariable("patientId") Long patientId);


    @ApiOperation(value = "Patients", notes = "Endpoint returns a list of patients", response = PatientDto.class, responseContainer = "List", tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Array of patients", response = PatientDto.class) })
    @RequestMapping(value = "/patients",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<PatientDto>> getPatients();


    @ApiOperation(value = "Update patient with the diagnosis", notes = "Update patient with the diagnosis", response = Void.class, tags={ "patient", })
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "Patient updated successfully", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/patients/{patientId}",
        produces = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> updatePatientById(@ApiParam(value = "ID of patient to fetch", required = true) @PathVariable("patientId") Long patientId,
                                           @NotNull @ApiParam(value = "diagnosis", required = true, allowableValues = "SCHIZOPHRENIC_P, SCHIZOPHRENIC_D, SCHIZOPHRENIC_C, SCHIZOPHRENIC_U, SCHIZOPHRENIC_R, BIPOLAR_SM1, BIPOLAR_SM2, BIPOLAR_SM3, BIPOLAR_SM4, BIPOLAR_MRMH, BIPOLAR_MRM1, BIPOLAR_MRM2, BIPOLAR_MRM3, BIPOLAR_MRM4, BIPOLAR_MRD1, BIPOLAR_MRD2, BIPOLAR_MRD3, BIPOLAR_MRD4, MDD_S1, MDD_S2, MDD_S3, MDD_S4, MDD_R1, MDD_R2, MDD_R3, MDD_R4") @RequestParam(value = "diagnosis", required = true) String diagnosis);

}
