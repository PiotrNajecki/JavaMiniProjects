import api.UsersRepository;
import implementations.SomeBean;
import implementations.UsersRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;



public class MainSpring {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml") {
//        };
//       //UsersRepository usersRepository = context.getBean("usersRepository", UsersRepositoryImpl.class);
//
//       SomeBean bean = context.getBean("someBean", SomeBean.class);

       //usersRepository.createUser("Janek");

//        Locale locale = Locale.getDefault();
//        Calendar calendar = GregorianCalendar.getInstance(locale);
//        SimpleDateFormat formatter = SimpleDateFormat.getInstance();
//        System.out.println(formatter.format(calendar.getTime()));

        ApplicationContext context1 = new ClassPathXmlApplicationContext("knofiguracja.xml");
        context1.getBean("calendar", Calendar.class);
        Date formatter = (Date) context1.getBean("formatter");
//        System.out.println(formatter.format(calendar.getTime()));
    }
}
