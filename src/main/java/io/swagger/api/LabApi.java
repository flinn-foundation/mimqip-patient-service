package io.swagger.api;

import io.swagger.model.CbcLabDto;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-02T16:51:59.735-04:00")

@Api(value = "Lab", description = "the Lab API")
public interface LabApi {

    @ApiOperation(value = "Save new cbc lab", notes = "Save new cbc lab", response = Long.class, tags={ "lab", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "null", response = Long.class) })
    @RequestMapping(value = "/patients/{patientId}/labs/cbc",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Long> saveCbcLab(@ApiParam(value = "Id of patient",required=true ) @PathVariable("patientId") Long patientId,
        @ApiParam(value = "CBC" ,required=true ) @RequestBody CbcLabDto cbc) {
        // do some magic!
        return new ResponseEntity<Long>(HttpStatus.OK);
    }

}
