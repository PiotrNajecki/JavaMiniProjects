package all.implementation;
import all.api.Logger;
import all.api.UsersRepository;
import all.domain.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


@Service ("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {
   // @Resource //(name = "withDateLoggerImpl")
    private Logger counterLoggerImpl;

    public User createUser(String name) {
        counterLoggerImpl.log("Tworzenie uzytkownika " + name);
        return new User(name);
    }

    @Resource(name = "withDateLoggerImpl")
    public void setLogger(Logger logger) {
        this.counterLoggerImpl = logger;
    }
}
