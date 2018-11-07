import api.Logger;
import api.UsersRepository;
import domain.User;
import implementations.LoggerImpl;
import implementations.UsersRepositoryImpl;

public class Main {

    public static void main(String[] args) {
        Logger logger = new LoggerImpl();
        UsersRepository usersRepository = new UsersRepositoryImpl();
       // usersRepository.setLogger(logger);

        User user = usersRepository.createUser("Janek");
    }
}
