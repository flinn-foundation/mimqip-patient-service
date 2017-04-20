package org.flinnfoundation.controller;

import io.swagger.api.ProgressNoteApi;
import io.swagger.model.ProgressNoteDto;
import org.flinnfoundation.mapper.ProgressNoteMapper;
import org.flinnfoundation.service.ProgressNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class ProgressNoteController implements ProgressNoteApi {

    private ProgressNoteService progressNoteService;
    private ProgressNoteMapper progressNoteMapper;

    @Autowired
    public ProgressNoteController(ProgressNoteService progressNoteService, ProgressNoteMapper progressNoteMapper) {
        this.progressNoteService = progressNoteService;
        this.progressNoteMapper = progressNoteMapper;
    }


    @Override
    public ResponseEntity<List<ProgressNoteDto>> getProgressNotes(@PathVariable Long patientId) {
        return ResponseEntity.ok(progressNoteMapper.convertModelToApiDto(progressNoteService.getProgressNotes(patientId)));
    }

    @Override
    public ResponseEntity<String> saveProgressNote(@PathVariable Long patientId, @RequestBody ProgressNoteDto progressNote) {

        progressNoteService.saveProgressNote(patientId, progressNoteMapper.convertApiDtoToModel(progressNote));

        try {
            return ResponseEntity.created(new URI("cat")).build();
        } catch (URISyntaxException e) {
            throw new RuntimeException("unable to cuonstruct URI");
        }
    }
}
