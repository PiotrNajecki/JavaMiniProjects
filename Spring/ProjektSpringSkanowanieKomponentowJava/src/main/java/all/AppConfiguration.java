package all;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "all")
public class AppConfiguration {
//    @Bean
//    public Logger logger() {
//        return new DateLoggerImpl();
//    }
//
//    @Bean
//    public UsersRepository usersRepository() {
//        UsersRepositoryImpl usersRepository = new UsersRepositoryImpl();
//        usersRepository.setLogger(logger());
//        return usersRepository;
//    }
}
