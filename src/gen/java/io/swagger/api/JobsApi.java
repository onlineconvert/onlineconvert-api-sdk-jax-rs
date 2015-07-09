package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.JobsApiService;
import io.swagger.api.factories.JobsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Job;
import java.math.BigDecimal;
import io.swagger.model.Conversion;
import io.swagger.model.InputFile;
import io.swagger.model.OutputFile;
import io.swagger.model.Thread;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/jobs")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/jobs", description = "the jobs API")
public class JobsApi  {

   private final JobsApiService delegate = JobsApiServiceFactory.getJobsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "List of jobs active for the current user identified by the key.", notes = "It will return the list of jobs for the given user. In order to get the jobs a key or token must be provided:\n  - If the user key is provided all jobs for the current will be return.\n  - If one token is provided it will return the job assigned to that token if any.\n  \nThe request is paginated with an amount of 50 elements per page in any case.\n", response = Job.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Gets the newly created job info"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input.") })

    public Response jobsGet(@ApiParam(value = "Filter the status of the job.") @QueryParam("status") String status,
    @ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "Pagination for list of elements.", defaultValue="1") @QueryParam("page") BigDecimal page)
    throws NotFoundException {
    return delegate.jobsGet(status,token,key,page);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Creates a new Job with the user key.", notes = "", response = Job.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Gets the newly created job info"),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "The JSON body is empty."),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input."),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too many concurrent requests."),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server not available.") })

    public Response jobsPost(@ApiParam(value = "Api key for the user to filter.",required=true) @QueryParam("key") String key,
    @ApiParam(value = "Content of the job." ,required=true ) Job body)
    throws NotFoundException {
    return delegate.jobsPost(key,body);
    }
    @GET
    @Path("/{job_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get information about a Job", notes = "", response = Job.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get information about a Job"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdGet(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdGet(token,key,jobId);
    }
    @DELETE
    @Path("/{job_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Cancels a job created that haven't been started. (Allow to cancel jobs in process.)", notes = "", response = Job.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get information about the removed Job."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdDelete(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdDelete(token,key,jobId);
    }
    @PATCH
    @Path("/{job_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Modifies the job identified by the id, allows to start a created job.", notes = "", response = Job.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get information about the removed Job"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "The status of the job could not be changed since it is in a invalid status."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdPatch(@ApiParam(value = "Content of the job." ,required=true ) Job body,
    @ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdPatch(body,token,key,jobId);
    }
    @GET
    @Path("/{job_id}/conversions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get list of conversions defined for the current job.", notes = "", response = Conversion.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get a list of all available conversions."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdConversionsGet(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdConversionsGet(token,key,jobId);
    }
    @POST
    @Path("/{job_id}/conversions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Adds a new conversion to the given job.", notes = "", response = Conversion.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "The created conversion."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdConversionsPost(@ApiParam(value = "information for the conversion." ,required=true ) Conversion body,
    @ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdConversionsPost(body,token,key,jobId);
    }
    @GET
    @Path("/{job_id}/conversions/{conversion_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get list of conversions defined for the current job.", notes = "", response = Conversion.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get a conversion for the current job"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdConversionsConversionIdGet(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId,
    @ApiParam(value = "Identifier for the job conversion.",required=true ) @PathParam("conversion_id") String conversionId)
    throws NotFoundException {
    return delegate.jobsJobIdConversionsConversionIdGet(token,key,jobId,conversionId);
    }
    @DELETE
    @Path("/{job_id}/conversions/{conversion_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Removes the conversion for a job.", notes = "", response = Conversion.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get the removed conversion for the current job."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdConversionsConversionIdDelete(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId,
    @ApiParam(value = "Identifier for the job conversion.",required=true ) @PathParam("conversion_id") String conversionId)
    throws NotFoundException {
    return delegate.jobsJobIdConversionsConversionIdDelete(token,key,jobId,conversionId);
    }
    @GET
    @Path("/{job_id}/input")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get list of binary source files for the conversion.hhh", notes = "Description of the get for the inputs of a specific job.", response = InputFile.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Downloads the binary for the file."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdInputGet(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdInputGet(token,key,jobId);
    }
    @POST
    @Path("/{job_id}/input")
    
    
    @io.swagger.annotations.ApiOperation(value = "Cretes a new input for the current job.", notes = "", response = InputFile.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "The created conversion."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdInputPost(@ApiParam(value = ""  ) InputFile body,
    @ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdInputPost(body,token,key,jobId);
    }
    @GET
    @Path("/{job_id}/input/{file_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get list of conversions defined for the current job.", notes = "", response = InputFile.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get a file for the current job"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdInputFileIdGet(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId,
    @ApiParam(value = "Id of the file to download",required=true ) @PathParam("file_id") String fileId)
    throws NotFoundException {
    return delegate.jobsJobIdInputFileIdGet(token,key,jobId,fileId);
    }
    @DELETE
    @Path("/{job_id}/input/{file_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Removes the input for a job.", notes = "", response = InputFile.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get the removed file for the current job."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdInputFileIdDelete(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId,
    @ApiParam(value = "Id of the file to download",required=true ) @PathParam("file_id") String fileId)
    throws NotFoundException {
    return delegate.jobsJobIdInputFileIdDelete(token,key,jobId,fileId);
    }
    @GET
    @Path("/{job_id}/output")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get list of converted.", notes = "", response = OutputFile.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Downloads the binary for the file"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdOutputGet(@ApiParam(value = "") @QueryParam("conversion_id") String conversionId,
    @ApiParam(value = "") @QueryParam("input_id") String inputId,
    @ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdOutputGet(conversionId,inputId,token,key,jobId);
    }
    @GET
    @Path("/{job_id}/output/{file_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get information about an output file source.", notes = "", response = OutputFile.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Gets the information for the file."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdOutputFileIdGet(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId,
    @ApiParam(value = "Id of the file to download",required=true ) @PathParam("file_id") String fileId)
    throws NotFoundException {
    return delegate.jobsJobIdOutputFileIdGet(token,key,jobId,fileId);
    }
    @DELETE
    @Path("/{job_id}/output/{file_id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a file from the output.", notes = "", response = OutputFile.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Gets the information for the deleted file."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdOutputFileIdDelete(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId,
    @ApiParam(value = "Id of the file to download",required=true ) @PathParam("file_id") String fileId)
    throws NotFoundException {
    return delegate.jobsJobIdOutputFileIdDelete(token,key,jobId,fileId);
    }
    @GET
    @Path("/{job_id}/threads")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get list of threads defined for the current job.", notes = "", response = Thread.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Get a list of all threads currently being processed."),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "No API key or invalid API key given."),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified job does not exists.") })

    public Response jobsJobIdThreadsGet(@ApiParam(value = "Token for authentication."  )@HeaderParam("token") String token,
    @ApiParam(value = "Api key for the user to filter.") @QueryParam("key") String key,
    @ApiParam(value = "ID of job that needs to be fetched",required=true ) @PathParam("job_id") String jobId)
    throws NotFoundException {
    return delegate.jobsJobIdThreadsGet(token,key,jobId);
    }
}

