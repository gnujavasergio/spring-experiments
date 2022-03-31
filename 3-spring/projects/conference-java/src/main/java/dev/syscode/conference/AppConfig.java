package dev.syscode.conference;

import dev.syscode.conference.repository.SpeakerRepository;
import dev.syscode.conference.repository.impl.SpeakerRepositoryImpl;
import dev.syscode.conference.service.SpeakerService;
import dev.syscode.conference.service.impl.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Solo inicia una sola vez siguiendo el patron Singleton
 */
@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        /**
         * setter injection
         */
        // SpeakerServiceImpl service = new SpeakerServiceImpl();
        // service.setSpeakerRepository(getSpeakerRepository());

        /**
         * Construct injection
         */
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new SpeakerRepositoryImpl();
    }
}


