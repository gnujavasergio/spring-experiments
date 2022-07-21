package dev.syscode.conference.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/syscode_conference?autoReconnect=true&useUnicode=true&characterEncoding=UTF8");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }
}
