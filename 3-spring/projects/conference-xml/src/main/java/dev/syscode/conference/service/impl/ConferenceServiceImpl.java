package dev.syscode.conference.service.impl;

import dev.syscode.conference.model.Conference;
import dev.syscode.conference.repository.ConferenceRepository;
import dev.syscode.conference.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class ConferenceServiceImpl implements ConferenceService {

    private ConferenceRepository conferenceRepository;

    /**
     * Required
     * autowire="byType"
     * autowire="byName"
     */
    public ConferenceServiceImpl() {
    }

    public ConferenceServiceImpl(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    @Override
    public List<Conference> findAll() {
        return conferenceRepository.findAll();
    }

    // autowire="byName"

    /**
     * Required
     * autowire="byType"
     * autowire="byName"
     * Si el nombre seria setRepository
     */
    // public void setConferenceRepository(ConferenceRepository conferenceRepository) {
    public void setRepository(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }
}
