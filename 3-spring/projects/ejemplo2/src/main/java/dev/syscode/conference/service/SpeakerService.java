package dev.syscode.conference.service;

import dev.syscode.conference.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
