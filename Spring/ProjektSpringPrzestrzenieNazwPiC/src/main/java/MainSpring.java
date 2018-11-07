
import domain.SomeBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        System.out.println(someBean);
        SomeBean someBean2 = context.getBean("someBean2", SomeBean.class);
        System.out.println(someBean2);
    }
}
