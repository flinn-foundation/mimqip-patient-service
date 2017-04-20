package org.flinnfoundation.service;

import org.flinnfoundation.model.Patient;
import org.flinnfoundation.model.ProgressNote;
import org.flinnfoundation.repository.ProgressNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressNoteService {

    private ProgressNoteRepository progressNoteRepository;
    private PatientService patientService;

    @Autowired
    public ProgressNoteService(ProgressNoteRepository progressNoteRepository, PatientService patientService) {
        this.progressNoteRepository = progressNoteRepository;
        this.patientService = patientService;
    }

    public List<ProgressNote> getProgressNotes(Long patientId) {
        Patient patient = patientService.getPatient(patientId);
        return patient.getProgressNotes();
    }

    public void saveProgressNote(Long patientId, ProgressNote progressNote) {

        progressNote.setPatient(patientService.getPatient(patientId));
        progressNoteRepository.save(progressNote);
    }
}
