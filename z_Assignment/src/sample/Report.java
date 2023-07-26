package sample;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Report {
	
	private List<Lis> list;
	

    public List<Lis> getList() {
	return list;
    }
		
}

