package all;

import all.api.Logger;
import all.api.UsersRepository;
import all.implementation.DateLoggerImpl;
import all.implementation.UsersRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Logger logger() {
        return new DateLoggerImpl();
    }

    @Bean
    public UsersRepository usersRepository() {
        UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger());
        return usersRepository;
    }
}
