package all.implementation;

import all.api.Logger;
import all.api.UsersRepository;
import all.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service ("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
    @Autowired(required=false)
    private Logger logger;
    @Value("${database.host}")
    private String host;
    @Value("${database.port}")
    private int port;
    @Value("${database.name}")
    private String database;

    @Value("#{database.user}")
    private String user;
    @Value("#{database.password}")
    private String password;

    // pola ktore definijua zapisywanie do bazy danych

    public User createUser(String name) {
        if (logger != null) {
        logger.log("Tworzenie uzytkownika " + name + " do bazy " + ":" + port + "/" + database);
        }
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
