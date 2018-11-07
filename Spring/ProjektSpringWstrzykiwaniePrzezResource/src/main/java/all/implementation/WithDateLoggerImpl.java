package all.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("withDateLoggerImpl")  // to jtest taki Bean który świadczy jakas usługę / tuttaj usługa logowania

public class WithDateLoggerImpl implements all.api.Logger {


    public void log(String message) {

        System.out.println(new Date() + ": " + message);
    }


}
