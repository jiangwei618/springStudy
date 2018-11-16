package MyTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    /*实现singletom bean中查找prototype bean*/
    public static void main(String[] args) {
        BeanFactory factoryBean = new ClassPathXmlApplicationContext("spring.xml");
        MyBean myBean = (MyBean) factoryBean.getBean("myTest");
        System.out.println(myBean.getMyBeanName());
        MyBean myBean2 = (MyBean) factoryBean.getBean("myTest");
        System.out.println(myBean2.getMyBeanName());
    }
}
