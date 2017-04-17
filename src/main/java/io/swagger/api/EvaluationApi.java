package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.EvaluationDto;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-17T14:33:30.618-04:00")

@Api(value = "Evaluation", description = "the Evaluation API")
public interface EvaluationApi {

    @ApiOperation(value = "Post results of new evaluation", notes = "Post results of new evaluation", response = EvaluationDto.class, tags={ "evaluation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Evaluation", response = EvaluationDto.class) })
    @RequestMapping(value = "/patients/{patientId}/evaluations",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<EvaluationDto> createPatientEvaluation(@ApiParam(value = "Id of patient evaluations to fetch",required=true ) @PathVariable("patientId") Long patientId,
        @ApiParam(value = "Evaluation to submit" ,required=true ) @RequestBody EvaluationDto evaluation) {
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
    default ResponseEntity<EvaluationDto> getEvaluationById(@ApiParam(value = "Id of patient evaluations to fetch",required=true ) @PathVariable("patientId") Long patientId,
        @ApiParam(value = "Id of evaluation to fetch",required=true ) @PathVariable("evaluationId") Long evaluationId) {
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
    default ResponseEntity<List<EvaluationDto>> getEvaluationsByPatientId(@ApiParam(value = "Id of patient evaluations to fetch",required=true ) @PathVariable("patientId") Long patientId,
         @ApiParam(value = "type of evaluation to pull", allowableValues = "BBDSS, PHQ9, GLOBAL, MENTAL_STATUS, PSRS, SUBSTANCE_ABUSE, VITAL_SIGNS, PSYCHIATRIC") @RequestParam(value = "evaluationType", required = false) String evaluationType) {
        // do some magic!
        return new ResponseEntity<List<EvaluationDto>>(HttpStatus.OK);
    }

}
