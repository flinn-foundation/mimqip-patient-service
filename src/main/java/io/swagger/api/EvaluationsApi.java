package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.EvaluationDto;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-06T13:58:51.528-04:00")

@Api(value = "evaluations", description = "the evaluations API")
public interface EvaluationsApi {

    @ApiOperation(value = "Post results of new psychiatric evaluations", notes = "Post results of new psychiatric evaluations", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Evaluation", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations/psychiatric",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<EvaluationDto> createPatientPsychEvaluation(@ApiParam(value = "Evaluation to submit" ,required=true ) @RequestBody EvaluationDto evaluation);


    @ApiOperation(value = "Get blank psychiatric evaluation", notes = "Get blank psychiatric evaluation", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Evaluation", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations/blank/psychiatric",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<EvaluationDto> getBlankPsychEvaluation();


    @ApiOperation(value = "Get all evaluations for patient", notes = "Get all evaluations for patient", response = EvaluationDto.class, responseContainer = "List", tags={ "evaluation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Array of evaluations", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<EvaluationDto>> getEvaluationsByPatientId( @NotNull @ApiParam(value = "Id of patient to fetch", required = true) @RequestParam(value = "patientId", required = true) Long patientId);


    @ApiOperation(value = "Get psychiatric evaluation by id", notes = "Get psychiatric evaluation by id", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Evaluation", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations/psychiatric/{evaluationId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<EvaluationDto> getPsychEvaluationById(@ApiParam(value = "Id of evaluation to fetch",required=true ) @PathVariable("evaluationId") Long evaluationId);


    @ApiOperation(value = "Get psychiatric evaluations for patient", notes = "Get psychiatric evaluations for patient", response = EvaluationDto.class, responseContainer = "List", tags={ "evaluation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Array of evaluations", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations/psychiatric",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<EvaluationDto>> getPsychEvaluationsByPatientId( @NotNull @ApiParam(value = "Id of patient to fetch", required = true) @RequestParam(value = "patientId", required = true) Long patientId);

}
