package com.ironhack.gson;

public class Book {

  private int id;
  private String name;
  private String author;
  private String genre;
  private String isbn;

  public Book() {
  }

  public Book(int id, String name, String author, String genre, String isbn) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.genre = genre;
    this.isbn = isbn;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", genre='" + genre + '\'' +
            ", isbn='" + isbn + '\'' +
            '}';
  }
}
