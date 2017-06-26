package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BooksApiService;
import io.swagger.api.factories.BooksApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Book;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/books")


@io.swagger.annotations.Api(description = "the books API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-12-03T07:51:23.751Z")
public class BooksApi  {
   private final BooksApiService delegate = BooksApiServiceFactory.getContactsApi();

    @GET
    
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Book.class, responseContainer = "List", tags={ "Contact",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Book.class, responseContainer = "List") })

    public Response contactsGet()
    throws NotFoundException {
        return delegate.booksGet();
    }
    @GET
    @Path("/{isbn}")
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Book.class, responseContainer = "List", tags={ "Contact" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Book.class, responseContainer = "List") })

    public Response contactsGetById(@ApiParam(value = "",required=true) @PathParam("isbn") String isbn)
    throws NotFoundException {
        return delegate.booksGetByIsbn(isbn);
    }
    
    @POST
    
    @Consumes({ "application/json", "text/json" })
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Book.class, responseContainer = "List", tags={ "Livro", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Book.class, responseContainer = "List") })
    public Response livrosCreate(@ApiParam(value = "Adiciona Livro" ,required=true) Book book )
    throws NotFoundException {
        return delegate.booksCreate(book);
    }
    @DELETE
    @Path("/{isbn}")
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Book.class, responseContainer = "List", tags={ "Livro", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Book.class, responseContainer = "List") })
    public Response livrosDeleteByISBN(@ApiParam(value = "",required=true) @PathParam("isbn") String isbn )
    throws NotFoundException {
        return delegate.booksDeleteByISBN(isbn);
    }    
    
    @GET
    @Path("/findByAutor")
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "Finds Books by Autor", notes = "Finds Books by Autor", response = Book.class, responseContainer = "List", tags={ "Livro", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Book.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid autor name", response = Book.class, responseContainer = "List") })
    public Response findBooksByAutor(@ApiParam(value = "Autor",required=true) @QueryParam("author") String author)
    throws NotFoundException {
        return delegate.findBooksByAuthor(author);
    }    
    
}

