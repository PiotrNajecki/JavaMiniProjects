package implementations;

import api.Logger;
import api.UsersRepository;
import domain.User;

public class UsersRepositoryImpl implements UsersRepository {
    private Logger logger;

    public UsersRepositoryImpl(Logger logger, String localization) {
        this.logger = logger;
        logger.log("Lokalizacja repozytorium: "+ localization);
    }

    public User createUser(String name) {
        logger.log("Tworzenie uzytkownika " + name);
        return new User(name);
    }
}
