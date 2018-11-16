import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) beanFactory.getBean("service");
        List<User> list = userService.get();
        System.out.println(list.get(0).getName());
    }
}
