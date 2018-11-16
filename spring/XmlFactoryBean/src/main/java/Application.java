import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        MyBean myBean = (MyBean) beanFactory.getBean("test");
        myBean.setName("jw");
        System.out.println(myBean.getName());
    }
}
