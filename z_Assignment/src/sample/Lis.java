package sample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lis {
	private String dt_txt;
	private Wind wind;
	private Main main;

	
	public String getDt_txt() {
		return dt_txt;
	}
	
	public Wind getWind() {
		return wind;
		
	}
	
	public Main getMain() {
		return main;
		
	}

}
