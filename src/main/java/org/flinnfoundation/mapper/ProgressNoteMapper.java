package org.flinnfoundation.mapper;

import io.swagger.model.ProgressNoteDto;
import org.flinnfoundation.model.ProgressNote;
import org.springframework.stereotype.Component;


@Component
public class ProgressNoteMapper extends OrikaMapper<ProgressNote, ProgressNoteDto> {

    protected ProgressNoteMapper() {
        super(ProgressNote.class, ProgressNoteDto.class);
    }
}
