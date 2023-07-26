package sample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {
	private Object speed;

	public Object getSpeed() {
		return speed;
	}
}
