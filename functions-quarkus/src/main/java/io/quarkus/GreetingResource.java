package io.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("hello")
@ApplicationScoped
public class GreetingResource {

    @Inject
    GreetingFunction greeter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return hello("hello");
    }

    @GET
    @Path("/{message}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("message") String message) {
        return this.greeter.message(message);
    }
}