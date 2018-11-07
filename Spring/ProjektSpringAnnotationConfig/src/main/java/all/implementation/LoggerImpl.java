package all.implementation;

import org.springframework.stereotype.Service;

import java.util.Date;

//@Service  // to jest taki Bean który świadczy jakas usługę - tutaj usługa logowania
public class LoggerImpl implements all.api.Logger {

    public void log(String message) {
        System.out.println(new Date() + ": " + message);
    }
}
