package MyTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory factoryBean = new ClassPathXmlApplicationContext("spring.xml");
        MyBean myBean = (MyBean) factoryBean.getBean("myTest");
        System.out.println(myBean.getMyBeanName());

        MyBean myBean2 = (MyBean) factoryBean.getBean("myTest");
        myBean2.setMyBeanName("we");
        System.out.println(myBean.getMyBeanName());
    }
}
