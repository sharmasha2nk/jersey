package com.sunnyj.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class SampleResource {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey get : " + msg;

		return Response.status(200).entity(output).build();

	}
	
	@POST
	@Path("/{param}")
	public Response postMsg(@PathParam("param") String msg) {

		String output = "Jersey post : " + msg;

		return Response.status(200).entity(output).build();

	}

	@PUT
	@Path("/{param}")
	public Response putMsg(@PathParam("param") String msg) {

		String output = "Jersey put : " + msg;

		return Response.status(200).entity(output).build();

	}

	@DELETE
	@Path("/{param}")
	public Response deleteMsg(@PathParam("param") String msg) {

		String output = "Jersey delete : " + msg;

		return Response.status(200).entity(output).build();

	}
	
	/**
	 * This guy will not let any other endpoints to take param as world
	 * 
	 * @return
	 */
	@GET
	@Path("/world")
	public Response getWorld() {

		String output = "Jersey get direct : World";

		return Response.status(200).entity(output).build();

	}

}
