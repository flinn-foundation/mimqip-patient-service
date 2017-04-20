package org.flinnfoundation.mapper;

import io.swagger.model.EvaluationDto;
import io.swagger.model.ProgressNoteDto;
import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.builtin.PassThroughConverter;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.flinnfoundation.model.ProgressNote;
import org.flinnfoundation.model.evaluation.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Component
public class ProgressNoteMapper {

    private BoundMapperFacade<ProgressNote, ProgressNoteDto> boundMapper;

    @Autowired
    protected ProgressNoteMapper() {

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.getConverterFactory().registerConverter(new DateConverter());
        mapperFactory.getConverterFactory().registerConverter(new LocalDateTimeConverter());
        mapperFactory.getConverterFactory().registerConverter(new PassThroughConverter(LocalDate.class));
        mapperFactory.classMap(Evaluation.class, EvaluationDto.class)
                .field("patient.id", "patientId")
                .byDefault()
                .register();


        boundMapper = mapperFactory.getMapperFacade(ProgressNote.class, ProgressNoteDto.class);
    }

    public ProgressNoteDto convertModelToApiDto(ProgressNote entity) {
        return boundMapper.map(entity);
    }

    public ProgressNote convertApiDtoToModel(ProgressNoteDto api) {
        return boundMapper.mapReverse(api);
    }

    public List<ProgressNoteDto> convertModelToApiDto(Iterable<ProgressNote> evaluations) {
        return StreamSupport.stream(evaluations.spliterator(), false)
                .map(this::convertModelToApiDto)
                .collect(Collectors.toList());
    }
}
