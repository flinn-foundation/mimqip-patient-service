package org.flinnfoundation.mapper;

import io.swagger.model.DiagnosisDto;
import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.builtin.PassThroughConverter;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.flinnfoundation.model.Diagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Component
public class DiagnosisMapper {

    private BoundMapperFacade<Diagnosis, DiagnosisDto> boundMapper;

    @Autowired
    protected DiagnosisMapper() {

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.getConverterFactory().registerConverter(new DateConverter());
        mapperFactory.getConverterFactory().registerConverter(new LocalDateTimeConverter());
        mapperFactory.getConverterFactory().registerConverter(new PassThroughConverter(LocalDate.class));
        mapperFactory.classMap(Diagnosis.class, DiagnosisDto.class)
                .field("patient.id", "patientId")
                .byDefault()
                .register();


        boundMapper = mapperFactory.getMapperFacade(Diagnosis.class, DiagnosisDto.class);
    }

    public DiagnosisDto convertModelToApiDto(Diagnosis entity) {
        return boundMapper.map(entity);
    }

    public Diagnosis convertApiDtoToModel(DiagnosisDto api) {
        return boundMapper.mapReverse(api);
    }

    public List<DiagnosisDto> convertModelToApiDto(Iterable<Diagnosis> diagnoses) {
        return StreamSupport.stream(diagnoses.spliterator(), false)
                .map(this::convertModelToApiDto)
                .collect(Collectors.toList());
    }
}
