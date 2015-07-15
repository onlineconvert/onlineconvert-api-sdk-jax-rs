package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Job;
import java.math.BigDecimal;
import io.swagger.model.Error;
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

public class JobsApiServiceImpl extends JobsApiService {
  
      @Override
      public Response jobsGet(String status,String xOcToken,String xOcApiKey,BigDecimal page)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsPost(String xOcApiKey,Job body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdGet(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdDelete(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdPatch(Job body,String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdConversionsGet(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdConversionsPost(Conversion body,String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdConversionsConversionIdGet(String xOcToken,String xOcApiKey,String jobId,String conversionId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdConversionsConversionIdDelete(String xOcToken,String xOcApiKey,String jobId,String conversionId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdInputGet(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdInputPost(InputFile body,String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdInputFileIdGet(String xOcToken,String xOcApiKey,String jobId,String fileId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdInputFileIdDelete(String xOcToken,String xOcApiKey,String jobId,String fileId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdOutputGet(String conversionId,String inputId,String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdOutputFileIdGet(String xOcToken,String xOcApiKey,String jobId,String fileId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdOutputFileIdDelete(String xOcToken,String xOcApiKey,String jobId,String fileId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response jobsJobIdThreadsGet(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
