package dev.syscode.conference.repository.impl;

import dev.syscode.conference.model.Speaker;
import dev.syscode.conference.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 50 }")
    private double age;

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Sergio Antonio");
        speaker.setLastName("Ochoa Martinez");
        speaker.setAge(age);
        speakers.add(speaker);

        System.out.println(calendar.getTime());
        return speakers;
    }
}
