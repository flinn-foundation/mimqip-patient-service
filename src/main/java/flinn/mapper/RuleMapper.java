package flinn.mapper;

import flinn.model.RuleEntity;
import io.swagger.model.Rule;
import org.springframework.stereotype.Component;


@Component
public class RuleMapper extends OrikaMapper<RuleEntity, Rule> {

    protected RuleMapper() {
        super(RuleEntity.class, Rule.class);
    }
}
