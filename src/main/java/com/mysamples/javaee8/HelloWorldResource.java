package com.mysamples.javaee8;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.Map;

import static java.util.Collections.singletonMap;

/**
 * The REST Resource implementation class.
 */
@Path("hello")
public class HelloWorldResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {
        Map<String, String> response = singletonMap("message", "Hello from RESTful API.");
        return Response.ok(response).build();
    }
}
