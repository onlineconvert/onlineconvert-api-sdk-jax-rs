package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StatusesApiService;
import io.swagger.api.factories.StatusesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Status;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/statuses")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/statuses", description = "the statuses API")
public class StatusesApi  {

   private final StatusesApiService delegate = StatusesApiServiceFactory.getStatusesApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Get a list of the valid statuses.", notes = "The endpoint provide a list of all available status that the Job may have during the process as a description of the status.", response = Status.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of statuses") })

    public Response statusesGet()
    throws NotFoundException {
    return delegate.statusesGet();
    }
}

