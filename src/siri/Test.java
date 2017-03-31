package siri;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/countries")
public class Test {
	
	CountryService countryService=new CountryService();
	
/*	@GET
	@Produces("application/json")
	public Response helloMethod()  throws JSONException{
		JSONObject json = new JSONObject();
		String hello = "HI SIRISHAAAA";
		return Response.status(200).entity(hello).build();
		
	} */
    
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getCountries()
    {
  
  List listOfCountries=countryService.getAllCountries();
  return listOfCountries;

 }
 
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
 public Country getCountryById(@PathParam("id") int id)
 {
  return countryService.getCountry(id);
 }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
 public Country addCountry(Country country)
 {
  return countryService.addCountry(country);
 }
 
   
 
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
 public void deleteCountry(@PathParam("id") int id)
 {
   countryService.deleteCountry(id);
  
 }
 


	
}
