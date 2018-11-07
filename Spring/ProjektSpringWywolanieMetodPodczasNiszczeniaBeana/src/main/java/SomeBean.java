import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements DisposableBean {
    public void destroyMethod() {
        System.out.println("Niszczenie Beana");
    }

    public void isWorking() {
        System.out.println("działa");
    }

    public void destroy() throws Exception {
        System.out.println("Niszczenie Beana 2");
    }
}
