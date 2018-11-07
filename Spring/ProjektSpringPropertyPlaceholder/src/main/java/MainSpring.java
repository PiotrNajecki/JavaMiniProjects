import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");

        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        System.out.println(someBean.getProperty());
        DatabaseRepository databaseRepository = context.getBean("myDatabase", DatabaseRepository.class);
        System.out.println(databaseRepository.getHost());
        System.out.println(databaseRepository.getPassword());
        System.out.println(databaseRepository.getPort());
        System.out.println(databaseRepository.getUser());
    }
}
