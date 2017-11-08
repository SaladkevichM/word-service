package rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/")
public class Request {

    @GET
    @Path("/readme")
    public Response getReadme() {
        String output = "README";
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/hello/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "hello - " + msg;
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/replace")
    public Response urlEncode(@FormParam("docx") String docx, @FormParam("value") String value) {
        return Response.status(201).entity("").build();
    }

}
