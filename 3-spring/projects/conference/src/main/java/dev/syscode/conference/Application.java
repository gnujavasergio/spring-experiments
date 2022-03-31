package dev.syscode.conference;

import dev.syscode.conference.model.Speaker;
import dev.syscode.conference.service.SpeakerService;
import dev.syscode.conference.service.impl.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();

        for (Speaker speaker : speakerService.findAll()) {
            System.out.println(speaker.getFirstName() + " " + speaker.getLastName());
        }

    }
}
