package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.EvaluationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-11T00:38:15.354-04:00")

@Api(value = "evaluations", description = "the evaluations API")
public interface EvaluationsApi {

    @ApiOperation(value = "Post results of new evaluation", notes = "Post results of new evaluation", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Evaluation", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations",
        produces = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<EvaluationDto> createPatientEvaluation(@ApiParam(value = "Evaluation to submit", required = true) @RequestBody EvaluationDto evaluation);


    @ApiOperation(value = "Get blank evaluation", notes = "Get blank evaluation", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Evaluation", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations/blank",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<EvaluationDto> getBlankEvaluation(@NotNull @ApiParam(value = "type of evaluation", required = true, allowableValues = "BBDSS, PHQ9, GLOBAL, MENTAL_STATUS, PSRS, SUBSTANCE_ABUSE, VITAL_SIGNS, PSYCHIATRIC") @RequestParam(value = "evaluationType", required = true) String evaluationType);


    @ApiOperation(value = "Get evaluation by id", notes = "Get evaluation by id", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Evaluation", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations/{evaluationId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<EvaluationDto> getEvaluationById(@ApiParam(value = "Id of evaluation to fetch", required = true) @PathVariable("evaluationId") Long evaluationId);


    @ApiOperation(value = "Get all evaluations for patient", notes = "Get all evaluations for patient", response = EvaluationDto.class, responseContainer = "List", tags={ "evaluation", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Array of evaluations", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/evaluations",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<EvaluationDto>> getEvaluationsByPatientId(@NotNull @ApiParam(value = "Id of patient evaluations to fetch", required = true) @RequestParam(value = "patientId", required = true) Long patientId,
                                                                  @ApiParam(value = "type of evaluation to pull", allowableValues = "BBDSS, PHQ9, GLOBAL, MENTAL_STATUS, PSRS, SUBSTANCE_ABUSE, VITAL_SIGNS, PSYCHIATRIC") @RequestParam(value = "evaluationType", required = false) String evaluationType);

}
