package MyTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    /*advisor 通常用在事物中*/
    public static void main(String[] args) {
        BeanFactory factoryBean = new ClassPathXmlApplicationContext("spring.xml");
        MyBean myBean = (MyBean) factoryBean.getBean("myTest");
        System.out.println(myBean.getMyBeanName());
    }
}
