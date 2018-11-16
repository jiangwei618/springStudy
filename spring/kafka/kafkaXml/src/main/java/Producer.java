import Message.SampleMessage;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {

	KafkaTemplate kafkaTemplate;

	Producer(KafkaTemplate kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void send(SampleMessage message) {
		this.kafkaTemplate.send("testTopic", message);
		System.out.println("Sent sample message [" + message + "]");
	}

}
