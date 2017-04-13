package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.EvaluationDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T10:55:56.619-04:00")

@Api(value = "Evaluation", description = "the Evaluation API")
public interface EvaluationApi {

    @ApiOperation(value = "Post results of new evaluation", notes = "Post results of new evaluation", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Evaluation", response = EvaluationDto.class) })
    @RequestMapping(value = "/patients/{patientId}/evaluations",
        produces = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<EvaluationDto> createPatientEvaluation(@ApiParam(value = "Id of patient evaluations to fetch", required = true) @PathVariable("patientId") Long patientId,
                                                                  @ApiParam(value = "Evaluation to submit", required = true) @RequestBody EvaluationDto evaluation) {
        // do some magic!
        return new ResponseEntity<EvaluationDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get evaluation by id", notes = "Get evaluation by id", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Evaluation", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/patients/{patientId}/evaluations/{evaluationId}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<EvaluationDto> getEvaluationById(@ApiParam(value = "Id of patient evaluations to fetch", required = true) @PathVariable("patientId") Long patientId,
                                                            @ApiParam(value = "Id of evaluation to fetch", required = true) @PathVariable("evaluationId") Long evaluationId) {
        // do some magic!
        return new ResponseEntity<EvaluationDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get all evaluations for patient", notes = "Get all evaluations for patient", response = EvaluationDto.class, responseContainer = "List", tags={ "evaluation", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Array of evaluations", response = EvaluationDto.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = EvaluationDto.class) })
    @RequestMapping(value = "/patients/{patientId}/evaluations",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<EvaluationDto>> getEvaluationsByPatientId(@ApiParam(value = "Id of patient evaluations to fetch", required = true) @PathVariable("patientId") Long patientId,
                                                                          @ApiParam(value = "type of evaluation to pull", allowableValues = "BBDSS, PHQ9, GLOBAL, MENTAL_STATUS, PSRS, SUBSTANCE_ABUSE, VITAL_SIGNS, PSYCHIATRIC") @RequestParam(value = "evaluationType", required = false) String evaluationType) {
        // do some magic!
        return new ResponseEntity<List<EvaluationDto>>(HttpStatus.OK);
    }

}
