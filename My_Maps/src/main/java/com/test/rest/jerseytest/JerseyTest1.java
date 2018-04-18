package com.test.rest.jerseytest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/welcome")
public class JerseyTest1 {

  @GET
  @Path("/get")
  @Produces(MediaType.APPLICATION_JSON)
  public Location sendJSON(@QueryParam("lati1") double lati1,@QueryParam("longi1") double longi1,@QueryParam("lati2") double lati2,@QueryParam("longi2") double longi2){
	   Location loc = new Location();
	   DistanceClac distcalc = new DistanceClac();
	   loc.setLat1(lati1);
	   loc.setLongi1(longi1);
	   loc.setLat2(lati2); 
	   loc.setLongi2(longi2);
	   double d=distcalc.calDistance(lati1,longi1,lati1,lati2);
	   loc.setDistance1(d);
	
	   
	   
	   
	   
	 return loc;
  } 

  
}
