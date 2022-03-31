package dev.syscode.conference.service.impl;

import dev.syscode.conference.model.Conference;
import dev.syscode.conference.repository.ConferenceRepository;
import dev.syscode.conference.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("conferenceService")
public class ConferenceServiceImpl implements ConferenceService {

    private ConferenceRepository conferenceRepository;

    @Autowired
    public ConferenceServiceImpl(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    @Override
    public List<Conference> findAll() {
        return conferenceRepository.findAll();
    }
}
