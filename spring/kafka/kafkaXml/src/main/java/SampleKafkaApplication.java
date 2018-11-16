import Message.SampleMessage;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleKafkaApplication {

	public static void main(String[] args) throws InterruptedException {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		beanFactory.getBean("consumer");
		Producer producer = (Producer) beanFactory.getBean("producer");
		producer.send(new SampleMessage(1,"?"));
	}

}
