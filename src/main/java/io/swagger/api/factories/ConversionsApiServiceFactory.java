package io.swagger.api.factories;

import io.swagger.api.ConversionsApiService;
import io.swagger.api.impl.ConversionsApiServiceImpl;

public class ConversionsApiServiceFactory {

   private final static ConversionsApiService service = new ConversionsApiServiceImpl();

   public static ConversionsApiService getConversionsApi()
   {
      return service;
   }
}
