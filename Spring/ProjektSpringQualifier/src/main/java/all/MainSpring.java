package all;


import all.implementation.UsersRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        UsersRepositoryImpl usersRepository = context.getBean("usersRepository", UsersRepositoryImpl.class);
        usersRepository.createUser("Piotr");
    }
}
