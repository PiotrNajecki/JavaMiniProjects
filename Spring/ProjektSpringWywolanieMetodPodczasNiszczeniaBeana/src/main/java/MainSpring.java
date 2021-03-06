import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        context.registerShutdownHook();
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        someBean.isWorking();
    }
}
