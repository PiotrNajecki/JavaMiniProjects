
import domain.User;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        User user = context.getBean("user2",User.class);
        System.out.println(user);
    }
}
