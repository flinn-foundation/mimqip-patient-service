package org.flinnfoundation.service;

import org.flinnfoundation.model.lab.CompleteBloodCountLab;
import org.flinnfoundation.repository.lab.CompleteBloodCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LabService {

    private CompleteBloodCountRepository completeBloodCountRepository;

    @Autowired
    public LabService(CompleteBloodCountRepository completeBloodCountRepository) {
        this.completeBloodCountRepository = completeBloodCountRepository;
    }

    public List<CompleteBloodCountLab> getCompleteBloodCounts() {
        completeBloodCountRepository.findAll().forEach(lab -> System.out.println(lab));

        return new ArrayList<>();
    }

    public CompleteBloodCountLab saveLab(CompleteBloodCountLab lab) {
        return completeBloodCountRepository.save(lab);
    }


}
