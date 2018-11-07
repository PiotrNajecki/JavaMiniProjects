import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "")
public class AppConfiguration {

    @Bean(name = "initMethod", destroyMethod = "destroyMethod")
    public SomeBean someBean1() {
        return new SomeBean();
    }
}
