package dev.syscode.conference;

import dev.syscode.conference.model.Conference;
import dev.syscode.conference.model.Speaker;
import dev.syscode.conference.service.ConferenceService;
import dev.syscode.conference.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerService = context.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService);

        for (Speaker speaker : speakerService.findAll()) {
            System.out.println(speaker.getFirstName() + " " + speaker.getLastName());
            System.out.println("Age: " + speaker.getAge());
        }

        SpeakerService speakerServiceSingleton = context.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerServiceSingleton); // Mismo objeto

        
        ConferenceService conferenceService = context.getBean("conferenceService", ConferenceService.class);
        System.out.println(conferenceService);

        for (Conference conference: conferenceService.findAll()) {
            System.out.println("Nombre: " + conference.getName() );
            System.out.println("Descripción: " + conference.getDescription() );
            System.out.println("Expositor: " +  conference.getSpeaker().getFirstName() + " " + conference.getSpeaker().getLastName());
        }

        ConferenceService conferenceServiceSingleton = context.getBean("conferenceService", ConferenceService.class);
        System.out.println(conferenceServiceSingleton); // Mismo objeto
    }
}
