package flinn.service;

import flinn.converter.RuleConverter;
import flinn.repository.RulesRepository;
import flinn.swagger.model.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RulesService {

    private RulesRepository rulesRepository;
    private RuleConverter ruleConverter;

    @Autowired
    public RulesService(RulesRepository rulesRepository, RuleConverter ruleConverter) {
        this.rulesRepository = rulesRepository;
        this.ruleConverter = ruleConverter;
    }

    public List<Rule> getAllRules() {
        return ruleConverter.entityToApiModel(rulesRepository.findAll());
    }
}
