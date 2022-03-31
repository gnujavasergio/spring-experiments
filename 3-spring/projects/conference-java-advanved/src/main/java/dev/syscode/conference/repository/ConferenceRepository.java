package dev.syscode.conference.repository;

import dev.syscode.conference.model.Conference;

import java.util.List;

public interface ConferenceRepository {

    List<Conference> findAll();
}
