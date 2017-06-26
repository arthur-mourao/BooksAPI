package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Book;

import java.util.*;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-12-03T07:51:23.751Z")
public class BooksApiServiceImpl extends BooksApiService {
  
      private ArrayList<Book> books = null;
      
      public BooksApiServiceImpl() {
            this.books = new ArrayList<Book>();
            this.books.add(new Book("1", "Barney Poland", "Barney", "Addison–Wesley", "2014"));
            this.books.add(new Book("2", "Lacy Barrera", "Lacy", "Addison–Wesley", "2014"));
            this.books.add(new Book("3", "Lora Riggs", "Lora", "Addison–Wesley", "2014"));
      }
  
      @Override
      public Response booksGet()
      throws NotFoundException {
    	  return Response.ok().entity(this.books).build();
      }
  
      @Override
      public Response booksGetByIsbn(String isbn)
      throws NotFoundException {
            Book ret = null;

            for(int i=0; i<this.books.size(); i++)
            {
                  if(this.books.get(i).getIsbn().equals(isbn))
                  {
                        ret = this.books.get(i);
                  }
            }
            return Response.ok().entity(ret).build();
      }

	@Override
	public Response booksDeleteByISBN(String isbn) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response booksCreate(Book book) throws NotFoundException {
		this.books.add(book);  
  	  	return Response.ok().entity(book).build();
	}

	@Override
	public Response findBooksByAuthor(String autor) throws NotFoundException {
        List<Book> ret = new ArrayList();

        for(int i=0; i<this.books.size(); i++)
        {
              if(this.books.get(i).getAuthor().equals(autor))
              {
                    ret.add(this.books.get(i)) ;
              }
        }
        return Response.ok().entity(ret).build();
	}
      
      
}
