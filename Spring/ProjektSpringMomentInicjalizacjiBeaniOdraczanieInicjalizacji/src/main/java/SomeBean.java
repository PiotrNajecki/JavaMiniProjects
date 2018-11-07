import org.springframework.beans.factory.InitializingBean;


import java.util.Map;

public class SomeBean implements InitializingBean {  //
    private int numer = 0;

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inicjalizacja " + this.numer);
        ++this.numer;
    }
}
