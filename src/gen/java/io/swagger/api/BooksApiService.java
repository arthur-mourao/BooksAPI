package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Book;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-12-03T07:51:23.751Z")
public abstract class BooksApiService {
  
      public abstract Response booksGet()
      throws NotFoundException;
  
      public abstract Response booksGetByIsbn(String isbn)
      throws NotFoundException;
      
      public abstract Response booksDeleteByISBN(String isbn) 
      throws NotFoundException;
      
      public abstract Response booksCreate(Book book) 
      throws NotFoundException;

      public abstract Response findBooksByAuthor(String autor)
      throws NotFoundException;
}
