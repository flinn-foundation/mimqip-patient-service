package io.swagger.api;


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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T12:47:45.331-04:00")

@Api(value = "medications", description = "the medications API")
public interface MedicationsApi {

    @ApiOperation(value = "Get all medications for patient", notes = "Get all medications for patient", response = Void.class, tags={ "medication", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/medications",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getPatientMedicationsByPatientId( @NotNull @ApiParam(value = "ID of patient to fetch", required = true) @RequestParam(value = "patientId", required = true) Long patientId);

}
