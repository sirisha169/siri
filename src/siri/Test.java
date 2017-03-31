package siri;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/test")
public class Test {
	
	@GET
	@Produces("application/json")
	public Response helloMethod()  throws JSONException{
		JSONObject json = new JSONObject();
		String hello = "HI SIRISHAAAA";
		return Response.status(200).entity(hello).build();
		
	}

}
