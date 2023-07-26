package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class My_Assignment {

	public static void main(String[] args) {
		RestAssured.baseURI="https://samples.openweathermap.org/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22");
		
        Report my = res.as(Report.class);
		
        List<Lis> no = my.getList();
		
		ArrayList<Object> list1 = new ArrayList<Object>();
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		int i=0;
		int k=0;
		while(i>=0) {
			System.out.println("Enter Input: ");
			k=input.nextInt();
			for(Lis in:no) {
					
				String DT = in.getDt_txt();
					
				list2.add(DT);	
				Object win = in.getWind().getSpeed();
					
				list1.add(win);
					
				Object temperature = in.getMain().getTemp();
					
					
				Main ma = in.getMain();
				Object press = ma.getPressure();
				list1.add(press);
					
				if(k==1) {
					System.out.println("Date : "+DT);
					System.out.println("Temperature :"+temperature);
					
				}
				if(k==2) {
					System.out.println("Date : "+DT);
					System.out.println("Wind Speed: "+win);
				}
				if(k==3) {
					System.out.println("Date : "+DT);
					System.out.println("Pressure: "+press);
				}
				
				if(k==0) {
					System.exit(i);
				}
			
		
	       }
			System.out.println("\n");
        
	}
		

	}

}
