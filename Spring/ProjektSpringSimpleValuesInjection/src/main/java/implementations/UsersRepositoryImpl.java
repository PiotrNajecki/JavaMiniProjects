package implementations;

import api.Logger;
import api.UsersRepository;
import domain.User;

public class UsersRepositoryImpl implements UsersRepository {
    private Logger logger;


    public User createUser(String name) {
        logger.log("Tworzenie uzytkownika " + name);
        return new User(name);

    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }




}
