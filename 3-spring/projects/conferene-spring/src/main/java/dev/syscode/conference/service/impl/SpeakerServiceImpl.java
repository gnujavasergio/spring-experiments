package dev.syscode.conference.service.impl;

import dev.syscode.conference.model.Speaker;
import dev.syscode.conference.repository.SpeakerRepository;
import dev.syscode.conference.repository.impl.SpeakerRepositoryImpl;
import dev.syscode.conference.service.SpeakerService;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository = new SpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
