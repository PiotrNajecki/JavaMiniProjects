import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

public class SomeBean implements BeanNameAware, ApplicationContextAware {  // implementuje interfejs BeanNabeAware
    private String name;
    private ApplicationContext applicationContext;

    public void setBeanName(String name) {   // metoda wywoływana przez Springa jak tylko Bean zostanie stworzony i zostana mu ustawione propertiese
        this.name = name;
    }

    private void init() {
        Map<String, SomeBean> beansOfType = applicationContext.getBeansOfType(SomeBean.class);
        System.out.println("Nazywam się " + name + " Jest nas już " + beansOfType.size());
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
