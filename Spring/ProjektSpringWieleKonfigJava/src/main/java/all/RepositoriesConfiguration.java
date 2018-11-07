package all;

import all.api.Logger;
import all.api.UsersRepository;
import all.implementation.UsersRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoriesConfiguration {

    @Autowired
    private Logger logger;

    @Autowired
    private LoggersConfiguration loggersConfiguration;

    @Bean
    public UsersRepository usersRepository() {
        UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(loggersConfiguration.logger());
        return usersRepository;
    }
}
