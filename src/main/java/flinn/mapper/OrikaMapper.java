package flinn.mapper;

import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

abstract public class OrikaMapper<T, K> {

    private BoundMapperFacade<T, K> boundMapper;

    protected OrikaMapper(Class<T> clazzT, Class<K> clazzK) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.getConverterFactory().registerConverter(new LocalDateTimeConverter());
        boundMapper = mapperFactory.getMapperFacade(clazzT, clazzK);
    }

    public K entityToApiModel(T entity) {
        return boundMapper.map(entity);
    }

    public T apiModelToEntity(K api) {
        return boundMapper.mapReverse(api);
    }

    public List<K> entityToApiModel(Iterable<T> ruleEntities) {
        return StreamSupport.stream(ruleEntities.spliterator(), false)
                .map(this::entityToApiModel)
                .collect(Collectors.toList());
    }


}
