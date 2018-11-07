package all.implementation;

import all.api.Logger;
import all.api.UsersRepository;
import all.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service ("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
    @Autowired(required=false)
    private Logger logger;

    public User createUser(String name) {
        if (logger != null) {
        logger.log("Tworzenie uzytkownika " + name); }
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}
