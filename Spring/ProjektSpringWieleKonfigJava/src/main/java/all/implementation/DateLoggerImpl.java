package all.implementation;


import org.springframework.stereotype.Service;

import java.util.Date;

@Service  // to jtest taki Bean który świadczy jakas usługę / tuttaj usługa logowania
public class DateLoggerImpl implements all.api.Logger {


    public void log(String message) {

        System.out.println(new Date() + ": " + message);
    }


}
