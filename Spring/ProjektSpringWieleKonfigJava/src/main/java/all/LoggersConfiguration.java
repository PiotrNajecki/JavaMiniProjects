package all;

import all.api.Logger;
import all.implementation.DateLoggerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggersConfiguration {
    @Autowired
    @Bean
    public Logger logger() {
        return new DateLoggerImpl();
    }
}
