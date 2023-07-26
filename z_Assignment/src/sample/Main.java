package sample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
	private Object pressure;
	private Object temp;

	public Object getPressure() {
		return pressure;
	}
	public Object getTemp() {
		return temp;
		
	}

}
