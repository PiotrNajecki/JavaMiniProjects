package all.implementation;

import all.api.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("CounterLoggerAnnotation")
public class CounterLoggerImpl implements Logger {
    private int counter = 0;

    public void log(String message) {
        System.out.println(counter++ + ": " + message);
    }
}
