package org.employee360.services;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/form16")
public class Form16Service {

	@GET
	@Produces("application/pdf")
	public Response downloadForm16(@QueryParam("empId") String empId, @QueryParam("year") String year) {
		File form16File = new File(
				"C:\\Users\\sivaprasad\\eclipse-workspace\\events\\files\\" + empId + "_" + year + ".pdf");
		ResponseBuilder responseBuilder = Response.ok((Object) form16File);
		responseBuilder.header("Content-Disposition", "attachment;filename=1B90_2017.pdf");
		return responseBuilder.build();
	}
}
