package flinn.service;

import flinn.mapper.RuleMapper;
import flinn.repository.RulesRepository;
import io.swagger.model.Rule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
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
        rulesRepository.findAll().forEach(rule -> log.info(rule.toString()));
        return new ArrayList<>();
    }

    public Rule getRule(Long id) {
        return ruleConverter.entityToApiModel(rulesRepository.findOne(id));
    }
}
