package dev.syscode.conference;

import dev.syscode.conference.repository.SpeakerRepository;
import dev.syscode.conference.repository.impl.SpeakerRepositoryImpl;
import dev.syscode.conference.service.SpeakerService;
import dev.syscode.conference.service.impl.SpeakerServiceImpl;
import dev.syscode.conference.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

/**
 * Solo inicia una sola vez siguiendo el patron Singleton
 */
@Configuration
@ComponentScan({"dev.syscode.conference"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calendarFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calendarFactory().getObject();
    }

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
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


