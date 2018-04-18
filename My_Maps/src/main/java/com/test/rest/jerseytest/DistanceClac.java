package com.test.rest.jerseytest;

public class DistanceClac {

	public  double calDistance(double lat1,double longi1,double lat2,double longi2){
		double R =6371;
		double dLat = deg2rad(lat2-lat1);
		double dLon = deg2rad(longi2-longi1);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
	    
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		double d = R * c; // Distance in km
	   
		return d;
		

	 }
	public  double deg2rad(double deg) {

		 return deg * (Math.PI / 180);

		 }
}
