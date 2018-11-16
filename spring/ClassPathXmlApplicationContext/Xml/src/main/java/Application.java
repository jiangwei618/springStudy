import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        MyBean myBean = (MyBean) beanFactory.getBean("test");
        myBean.setName("jw");
        System.out.println(myBean.getName());
    }
}
