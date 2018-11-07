package domain;

import java.util.logging.Logger;

public class UserCreator {
    Logger logger = Logger.getLogger(this.getClass().getName());

    public User createUser(String name) {
        logger.info("Tworzenie uzytkownika" + name);
        User user = new User(name);
        user.setName(name);
        return user;
    }
}
