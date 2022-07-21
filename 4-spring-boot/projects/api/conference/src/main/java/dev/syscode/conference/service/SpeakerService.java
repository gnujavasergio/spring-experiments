package dev.syscode.conference.service;

import dev.syscode.conference.bean.Speaker;

import java.util.List;

public interface SpeakerService {

    List<Speaker> findAll();

    Speaker getSpeaker(long id);

    Speaker save(Speaker speaker);

    Speaker update(long id, Speaker speaker);

    void delete(long id);
}
