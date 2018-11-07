import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("AppConfiguration.class");
        context.registerShutdownHook();
        context.getBean("someBean1");
        context.close();

//        context.getBean("someBean1");
//        context.getBean("someBean1");
//        context.getBean("someBean1");




    }

}
