package io.swagger.api.factories;

import io.swagger.api.BooksApiService;
import io.swagger.api.impl.BooksApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-12-03T07:51:23.751Z")
public class BooksApiServiceFactory {

   private final static BooksApiService service = new BooksApiServiceImpl();

   public static BooksApiService getContactsApi()
   {
      return service;
   }
}
