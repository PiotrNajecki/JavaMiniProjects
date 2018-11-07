import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean {
    public void init() {
        System.out.println("Inicjalizacja Beana");
    }

    public void checkIsWorking() {
        System.out.println("Działa");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("odpalamy afetProperset");
    }
}
