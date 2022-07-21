package dev.syscode.conference.service.impl;

import dev.syscode.conference.bean.Speaker;
import dev.syscode.conference.repository.SpeakerRepository;
import dev.syscode.conference.service.SpeakerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;


    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    @Override
    public Speaker getSpeaker(long id) {
        return speakerRepository.findById(id).get();
    }

    @Override
    public Speaker save(Speaker speaker) {
        return speakerRepository.saveAndFlush(speaker);
    }

    @Override
    public Speaker update(long id, Speaker speaker) {
        Speaker oldSpeaker = speakerRepository.getById(id);
        // Tercer Parametro es la propiedad que no queremos copiar
        BeanUtils.copyProperties(speaker, oldSpeaker, "id");
        return speakerRepository.saveAndFlush(oldSpeaker);
    }

    @Override
    public void delete(long id) {
        speakerRepository.deleteById(id);
    }
}
