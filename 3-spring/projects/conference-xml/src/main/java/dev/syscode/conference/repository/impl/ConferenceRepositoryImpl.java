package dev.syscode.conference.repository.impl;

import dev.syscode.conference.model.Conference;
import dev.syscode.conference.model.Speaker;
import dev.syscode.conference.repository.ConferenceRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class ConferenceRepositoryImpl implements ConferenceRepository {


    @Override
    public List<Conference> findAll() {
        List<Conference> conferences = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Sergio Antonio");
        speaker.setLastName("Ochoa Martinez");

        Conference conference = new Conference();
        conference.setName("Spring Framewokr");
        conference.setSpeaker(speaker);
        conference.setDescription("Fundamentos de spring fraemwork");
        conferences.add(conference);

        return conferences;
    }
}
