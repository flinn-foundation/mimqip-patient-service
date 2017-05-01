package io.swagger.api;

import io.swagger.model.ProgressNoteDto;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-01T09:57:31.870-04:00")

@Api(value = "ProgressNote", description = "the ProgressNote API")
public interface ProgressNoteApi {

    @ApiOperation(value = "Get progress notes for patient", notes = "Get progress notes for patient", response = ProgressNoteDto.class, responseContainer = "List", tags={ "progressNote", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Progress Notes", response = ProgressNoteDto.class) })
    @RequestMapping(value = "/patients/{patientId}/progressNotes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ProgressNoteDto>> getProgressNotes(@ApiParam(value = "Id of patient progress notes to fetch",required=true ) @PathVariable("patientId") Long patientId) {
        // do some magic!
        return new ResponseEntity<List<ProgressNoteDto>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Save new progress note for patient", notes = "Save new progress note for patient", response = String.class, tags={ "progressNote", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Progress note Id", response = String.class) })
    @RequestMapping(value = "/patients/{patientId}/progressNotes",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<String> saveProgressNote(@ApiParam(value = "Id of patient progress note to create",required=true ) @PathVariable("patientId") Long patientId,
        @ApiParam(value = "Progress note to submit" ,required=true ) @RequestBody ProgressNoteDto progressNote) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
