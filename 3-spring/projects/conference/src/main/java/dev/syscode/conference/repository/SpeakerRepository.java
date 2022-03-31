package dev.syscode.conference.repository;

import dev.syscode.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepository {

    List<Speaker> findAll();
}
