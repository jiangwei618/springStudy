package Message;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.databind.ObjectMapper;

@AllArgsConstructor
@NoArgsConstructor
public class SampleMessage {

	private  Integer id;

	private  String message;


	public Integer getId() {
		return this.id;
	}

	public String getMessage() {
		return this.message;
	}

	@Override
	public String toString() {
		return "Message.SampleMessage{id=" + this.id + ", message='" + this.message + "'}";
	}

}
