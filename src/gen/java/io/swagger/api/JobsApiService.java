package io.swagger.api;

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

public abstract class JobsApiService {
  
      public abstract Response jobsGet(String status,String xOcToken,String xOcApiKey,BigDecimal page)
      throws NotFoundException;
  
      public abstract Response jobsPost(String xOcApiKey,Job body)
      throws NotFoundException;
  
      public abstract Response jobsJobIdGet(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdDelete(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdPatch(Job body,String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdConversionsGet(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdConversionsPost(Conversion body,String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdConversionsConversionIdGet(String xOcToken,String xOcApiKey,String jobId,String conversionId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdConversionsConversionIdDelete(String xOcToken,String xOcApiKey,String jobId,String conversionId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdInputGet(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdInputPost(InputFile body,String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdInputFileIdGet(String xOcToken,String xOcApiKey,String jobId,String fileId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdInputFileIdDelete(String xOcToken,String xOcApiKey,String jobId,String fileId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdOutputGet(String conversionId,String inputId,String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdOutputFileIdGet(String xOcToken,String xOcApiKey,String jobId,String fileId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdOutputFileIdDelete(String xOcToken,String xOcApiKey,String jobId,String fileId)
      throws NotFoundException;
  
      public abstract Response jobsJobIdThreadsGet(String xOcToken,String xOcApiKey,String jobId)
      throws NotFoundException;
  
}
