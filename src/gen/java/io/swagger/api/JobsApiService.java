package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

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

public abstract class JobsApiService {
  
      public abstract Response jobsGet(String status,String token,String key,BigDecimal page)
      throws NotFoundException;
  
      public abstract Response jobsPost(String key,Job body)
      throws NotFoundException;
  
      public abstract Response jobsJobIdGet(String token,String key,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdDelete(String token,String key,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdPatch(Job body,String token,String key,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdConversionsGet(String token,String key,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdConversionsPost(Conversion body,String token,String key,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdConversionsConversionIdGet(String token,String key,String jobId,String conversionId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdConversionsConversionIdDelete(String token,String key,String jobId,String conversionId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdInputGet(String token,String key,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdInputPost(InputFile body,String token,String key,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdInputFileIdGet(String token,String key,String jobId,String fileId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdInputFileIdDelete(String token,String key,String jobId,String fileId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdOutputGet(String conversionId,String inputId,String token,String key,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdOutputFileIdGet(String token,String key,String jobId,String fileId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdOutputFileIdDelete(String token,String key,String jobId,String fileId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdThreadsGet(String token,String key,String jobId)
      throws NotFoundException;
  
}
