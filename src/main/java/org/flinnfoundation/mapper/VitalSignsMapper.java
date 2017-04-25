package org.flinnfoundation.mapper;

import io.swagger.model.VitalSignsDto;
import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.builtin.PassThroughConverter;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.flinnfoundation.model.vitals.VitalSigns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Component
public class VitalSignsMapper {

    private BoundMapperFacade<VitalSigns, VitalSignsDto> boundMapper;

    @Autowired
    protected VitalSignsMapper() {

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.getConverterFactory().registerConverter(new DateConverter());
        mapperFactory.getConverterFactory().registerConverter(new LocalDateTimeConverter());
        mapperFactory.getConverterFactory().registerConverter(new PassThroughConverter(LocalDate.class));
        mapperFactory.classMap(VitalSigns.class, VitalSignsDto.class)
                .field("patient.id", "patientId")
                .byDefault()
                .register();


        boundMapper = mapperFactory.getMapperFacade(VitalSigns.class, VitalSignsDto.class);
    }

    public VitalSignsDto convertModelToApiDto(VitalSigns entity) {
        return boundMapper.map(entity);
    }

    public VitalSigns convertApiDtoToModel(VitalSignsDto api) {
        return boundMapper.mapReverse(api);
    }

    public List<VitalSignsDto> convertModelToApiDto(Iterable<VitalSigns> evaluations) {
        return StreamSupport.stream(evaluations.spliterator(), false)
                .map(this::convertModelToApiDto)
                .collect(Collectors.toList());
    }
}
