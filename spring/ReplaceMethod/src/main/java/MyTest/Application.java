package MyTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {
    /*替换原有逻辑 replace method 和 aop 不同，其支持最基础的XmlBeanFactory*/
    public static void main(String[] args) {
        BeanFactory factoryBean = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        MyBean myBean = (MyBean) factoryBean.getBean("myTest");
        System.out.println(myBean.getMyBeanName());
    }
}
