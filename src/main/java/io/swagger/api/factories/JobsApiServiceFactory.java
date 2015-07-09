package io.swagger.api.factories;

import io.swagger.api.JobsApiService;
import io.swagger.api.impl.JobsApiServiceImpl;

public class JobsApiServiceFactory {

   private final static JobsApiService service = new JobsApiServiceImpl();

   public static JobsApiService getJobsApi()
   {
      return service;
   }
}
