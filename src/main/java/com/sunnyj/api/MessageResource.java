package com.sunnyj.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sunnyj.api.model.Message;

@Path("/json/")
public class MessageResource {

	@GET
	@Path("/{message}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("message") String message) {
		return new Message(message);
	}

}
