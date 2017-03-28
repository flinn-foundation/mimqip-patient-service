package flinn.mapper;

import flinn.model.Rule;
import org.springframework.stereotype.Component;


@Component
public class RuleMapper extends OrikaMapper<Rule, io.swagger.model.Rule> {

    protected RuleMapper() {
        super(Rule.class, io.swagger.model.Rule.class);
    }
}
