package dev.syscode.configurations.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Value("${openkm.url}")
    private String url;

    @Value("${openkm.user}")
    private String user;

    @Value("${openkm.password}")
    private String password;

}
