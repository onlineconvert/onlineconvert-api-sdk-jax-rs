package io.swagger.api.factories;

import io.swagger.api.StatusesApiService;
import io.swagger.api.impl.StatusesApiServiceImpl;

public class StatusesApiServiceFactory {

   private final static StatusesApiService service = new StatusesApiServiceImpl();

   public static StatusesApiService getStatusesApi()
   {
      return service;
   }
}
