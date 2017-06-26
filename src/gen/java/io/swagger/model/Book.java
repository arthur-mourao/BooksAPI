package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-12-03T07:51:23.751Z")
public class Book  {
  
  private String isbn = null;
  private String name = null;
  private String author = null;
  private String publisher = null;
  private String year = null;
  
  //Introducing the dummy constructor
  public Book() {
  }  
  
  public Book(String isbn, String name, String author, String publisher, String year) {
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.year = year;
  }
  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Id")
  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String id) {
    this.isbn = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Publisher")
  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  
  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Year")
  public String getYear() {
    return year;
  }
  public void setYear(String year) {
    this.year = year;
  }
    

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("  id: ").append(isbn).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
