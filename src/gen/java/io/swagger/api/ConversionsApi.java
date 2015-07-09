package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ConversionsApiService;
import io.swagger.api.factories.ConversionsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Conversion;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/conversions")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/conversions", description = "the conversions API")
public class ConversionsApi  {

   private final ConversionsApiService delegate = ConversionsApiServiceFactory.getConversionsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Get a list of the valid conversions.", notes = "Gets a list of the valid conversions that can be made with the API. For each conversion is also shown the available options for that specific type of conversion.\n\nThis conversions can be added to a Job through the specific endpoint or in the information given to create the new Job.\n", response = Conversion.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of conversions") })

    public Response conversionsGet(@ApiParam(value = "Category for the conversion.") @QueryParam("category") String category,
    @ApiParam(value = "Target for for the conversion.") @QueryParam("target") String target,
    @ApiParam(value = "Pagination for list of elements.", defaultValue="1") @QueryParam("page") BigDecimal page)
    throws NotFoundException {
    return delegate.conversionsGet(category,target,page);
    }
}

