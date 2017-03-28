package flinn.service;

import flinn.mapper.RuleMapper;
import flinn.repository.RuleRepository;
import io.swagger.model.Rule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class RulesService {

    private RuleRepository ruleRepository;
    private RuleMapper ruleConverter;

    @Autowired
    public RulesService(RuleRepository ruleRepository, RuleMapper ruleConverter) {
        this.ruleRepository = ruleRepository;
        this.ruleConverter = ruleConverter;
    }

    public List<Rule> getAllRules() {
        ruleRepository.findAll().forEach(rule -> log.info(rule.toString()));
        return new ArrayList<>();
    }

    public Rule getRule(Long id) {
        return ruleConverter.entityToApiModel(ruleRepository.findOne(id));
    }
}
