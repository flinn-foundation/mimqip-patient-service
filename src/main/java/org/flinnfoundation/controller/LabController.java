package org.flinnfoundation.controller;

import io.swagger.api.LabApi;
import io.swagger.model.CbcLabDto;
import org.flinnfoundation.mapper.CbcMapper;
import org.flinnfoundation.model.lab.Lab;
import org.flinnfoundation.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController implements LabApi {

    private LabService labService;
    private CbcMapper cbcMapper;

    @Autowired
    public LabController(LabService labService, CbcMapper cbcMapper) {
        this.labService = labService;
        this.cbcMapper = cbcMapper;
    }

    @Override
    public ResponseEntity<Long> saveCbcLab(@PathVariable Long patientId, @RequestBody CbcLabDto cbc) {
        cbc.setPatientId(patientId);

        Lab lab = labService.saveLab(cbcMapper.convertApiDtoToModel(cbc));
        return ResponseEntity.ok(lab.getId());
    }
}
