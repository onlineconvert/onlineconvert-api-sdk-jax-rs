package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Conversion;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

public abstract class ConversionsApiService {
  
      public abstract Response conversionsGet(String category,String target,BigDecimal page)
      throws NotFoundException;
  
}
