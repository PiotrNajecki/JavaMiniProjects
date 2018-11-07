package all;


import all.domain.User;
import all.implementation.UsersRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        UsersRepositoryImpl usersRepository = context.getBean("usersRepository", UsersRepositoryImpl.class);
        User janek = usersRepository.createUser("Piotr");
        System.out.println("Uzytkownik "+janek.getName() + " został utworzony");
    }
}
