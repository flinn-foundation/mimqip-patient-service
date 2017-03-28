package flinn.service;

import flinn.mapper.RuleMapper;
import flinn.repository.RulesRepository;
import io.swagger.model.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RulesService {

    private RulesRepository rulesRepository;
    private RuleMapper ruleConverter;

    @Autowired
    public RulesService(RulesRepository rulesRepository, RuleMapper ruleConverter) {
        this.rulesRepository = rulesRepository;
        this.ruleConverter = ruleConverter;
    }

    public List<Rule> getAllRules() {
        return ruleConverter.entityToApiModel(rulesRepository.findAll());
    }

    public Rule getRule(Long id) {
        return ruleConverter.entityToApiModel(rulesRepository.findOne(id));
    }
}
