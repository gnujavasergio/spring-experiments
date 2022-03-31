package dev.syscode.conference;

import dev.syscode.conference.model.Speaker;
import dev.syscode.conference.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = context.getBean("speakerService", SpeakerService.class);

        for (Speaker speaker : speakerService.findAll()) {
            System.out.println(speaker.getFirstName() + " " + speaker.getLastName());
        }

    }
}
