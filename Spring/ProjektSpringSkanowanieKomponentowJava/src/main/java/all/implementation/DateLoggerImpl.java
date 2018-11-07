package all.implementation;

import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class DateLoggerImpl implements all.api.Logger {

    public void log(String message) {
        System.out.println(new Date() + ": " + message);
    }
}
