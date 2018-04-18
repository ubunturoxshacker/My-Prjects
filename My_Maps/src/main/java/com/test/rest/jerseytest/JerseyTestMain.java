package com.test.rest.jerseytest;

import java.util.Scanner;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class JerseyTestMain {
	public static void main(String args[]){
		double lat1;
		double long1;
		double lat2;
		double long2;
		
		 String getURL = "http://localhost:8080/My_Maps/rest/welcome/get";
		 
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter latitude of 1st place");
		 lat1 = in.nextDouble();
		 System.out.print("Enter longitude of 1st place");
		 long1=in.nextDouble();
		 System.out.print("Enter latitude of 2nd place");
		 lat2=in.nextDouble();
		 System.out.print("Enter longitude of 2nd place");
		 long2=in.nextDouble();
		
		 ClientConfig clientConfig = new DefaultClientConfig(); 
		 clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
		 Client client = Client.create(clientConfig);
		 WebResource webResourceGet = client.resource(getURL)

		 
				 
		 
	 }
}
