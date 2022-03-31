package dev.syscode.conference.service;

import dev.syscode.conference.model.Conference;

import java.util.List;

public interface ConferenceService {

    List<Conference> findAll();
}
