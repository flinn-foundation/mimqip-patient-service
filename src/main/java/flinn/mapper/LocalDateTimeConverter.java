package flinn.mapper;

import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class LocalDateTimeConverter extends BidirectionalConverter<LocalDateTime, OffsetDateTime> {

    @Override
    public OffsetDateTime convertTo(LocalDateTime source, Type<OffsetDateTime> destinationType, MappingContext mappingContext) {
        return OffsetDateTime.of(source, ZoneOffset.UTC);
    }

    @Override
    public LocalDateTime convertFrom(OffsetDateTime source, Type<LocalDateTime> destinationType, MappingContext mappingContext) {
        return source.toLocalDateTime();
    }


//    public OffsetDateTime convertTo(LocalDateTime source, Type<OffsetDateTime> destinationType) {
//        // convert in one direction
//    }
//
//    public LocalDateTime convertFrom(OffsetDateTime source, Type<LocalDateTime> destinationType) {
//        // convert in the other direction
//    }
//
//    @Override
//    public OffsetDateTime convertTo(LocalDateTime source, ma.glasnost.orika.metadata.Type<OffsetDateTime> destinationType, MappingContext mappingContext) {
//        return null;
//    }
//
//    @Override
//    public LocalDateTime convertFrom(OffsetDateTime source, Type<LocalDateTime> destinationType, MappingContext mappingContext) {
//        return null;
//    }
}
