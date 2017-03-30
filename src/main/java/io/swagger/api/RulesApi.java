package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.Rule;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-30T15:14:24.034-04:00")

@Api(value = "rules", description = "the rules API")
public interface RulesApi {

    @ApiOperation(value = "Rules", notes = "Endpoint returns a list of rules", response = Rule.class, responseContainer = "List", tags={ "rule", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Array of rules", response = Rule.class) })
    @RequestMapping(value = "/rules",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<Rule>> rulesGet() {
        // do some magic!
        return new ResponseEntity<List<Rule>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Rule by ID", notes = "Access a single rule by ID", response = Rule.class, tags={ "rule", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Rule", response = Rule.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Rule.class) })
    @RequestMapping(value = "/rules/{id}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Rule> rulesIdGet(@ApiParam(value = "ID of rule to fetch", required = true) @PathVariable("id") Long id) {
        // do some magic!
        return new ResponseEntity<Rule>(HttpStatus.OK);
    }

}
