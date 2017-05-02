package org.flinnfoundation.mapper;

import io.swagger.model.PatientSimpleDto;
import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.builtin.PassThroughConverter;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.flinnfoundation.mapper.converter.DateConverter;
import org.flinnfoundation.mapper.converter.LocalDateTimeConverter;
import org.flinnfoundation.model.Patient;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Component
public class PatientSimpleMapper {

    private BoundMapperFacade<Patient, PatientSimpleDto> boundMapper;

    protected PatientSimpleMapper() {

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.getConverterFactory().registerConverter(new DateConverter());
        mapperFactory.getConverterFactory().registerConverter(new LocalDateTimeConverter());
        mapperFactory.getConverterFactory().registerConverter(new PassThroughConverter(LocalDate.class));
        mapperFactory.classMap(Patient.class, PatientSimpleDto.class)
                .byDefault()
                .register();


        boundMapper = mapperFactory.getMapperFacade(Patient.class, PatientSimpleDto.class);
    }

    public PatientSimpleDto convertModelToApiDto(Patient entity) {
        return boundMapper.map(entity);
    }

    public Patient convertApiDtoToModel(PatientSimpleDto api) {
        return boundMapper.mapReverse(api);
    }

    public List<PatientSimpleDto> convertModelToApiDto(Iterable<Patient> patients) {
        return StreamSupport.stream(patients.spliterator(), false)
                .map(this::convertModelToApiDto)
                .collect(Collectors.toList());
    }
}
