import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = (UserMapper) beanFactory.getBean("userMapper");
        System.out.println(userMapper.getAllUser().get(0).getName());
    }
}
