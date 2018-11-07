package all.implementation;
import java.util.Date;

public class DateLoggerImpl implements all.api.Logger {

    public void log(String message) {
        System.out.println(new Date() + ": " + message);
    }
}
