package dev.syscode.conference;

import dev.syscode.conference.repository.SpeakerRepository;
import dev.syscode.conference.repository.impl.SpeakerRepositoryImpl;
import dev.syscode.conference.service.SpeakerService;
import dev.syscode.conference.service.impl.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        // service.setSpeakerRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new SpeakerRepositoryImpl();
    }
}


