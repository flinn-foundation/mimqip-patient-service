package org.flinnfoundation.service;

import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.vitals.VitalSigns;
import org.flinnfoundation.repository.VitalSignsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitalSignsService {

    private VitalSignsRepository vitalSignsRepository;

    @Autowired
    public VitalSignsService(VitalSignsRepository vitalSignsRepository) {
        this.vitalSignsRepository = vitalSignsRepository;
    }

    public List<VitalSigns> getVitalsList(Patient patient) {
        return patient.getVitalSignsList();
    }


    public VitalSigns saveVitals(VitalSigns vitalSigns) {
        return vitalSignsRepository.save(vitalSigns);
    }
}
