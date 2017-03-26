package flinn.converter;

import flinn.model.RuleEntity;
import flinn.swagger.model.Rule;
import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Component
public class RuleConverter {

    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    BoundMapperFacade<RuleEntity, Rule> boundMapper = mapperFactory.getMapperFacade(RuleEntity.class, Rule.class);

    public Rule entityToApiModel(RuleEntity ruleEntity) {
        return boundMapper.map(ruleEntity);
    }

    public RuleEntity entityToApiModel(Rule rule) {
        return boundMapper.mapReverse(rule);
    }

    public List<Rule> entityToApiModel(Iterable<RuleEntity> ruleEntities) {
        return StreamSupport.stream(ruleEntities.spliterator(), false)
                .map(this::entityToApiModel)
                .collect(Collectors.toList());
    }


}
