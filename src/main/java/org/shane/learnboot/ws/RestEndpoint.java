package org.shane.learnboot.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shane.learnboot.bean.People;
import org.springframework.stereotype.Component;

@Component
@Path("/endpoint")
public class RestEndpoint {

	@GET
	@Path("/hello")
	public String hello() {
		return "Hello";
	}

	@GET
	@Path("/people")
	@Produces(MediaType.APPLICATION_JSON)
	public People people() {
		People people = new People();
		people.setName("Shane");
		people.setAge(18);
		return people;
	}
}
