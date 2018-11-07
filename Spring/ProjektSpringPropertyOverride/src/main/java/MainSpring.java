import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        System.out.println(context.getBean("myDatabase"));

//        DatabaseRepository databaseRepository = context.getBean("myDatabase", DatabaseRepository.class);
    }
}
