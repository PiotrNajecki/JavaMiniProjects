
import domain.SomeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        SomeBean someBean = context.getBean("someBean",SomeBean.class);
//        System.out.println(someBean.getSettings());
//        System.out.println(someBean.getLocales());
    }
}
