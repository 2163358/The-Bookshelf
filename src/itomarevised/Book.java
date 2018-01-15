/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itomarevised;

/**
 *
 * @author Hp
 */
public class Book {

    private int book_id;
    private String isbn;
    private String title;
    private String description;
    private int publication_year;
    private String status;
    private String category;
    private String author;
    private String publisher;

    public Book(int book_id, String isbn, String title, String description, int publication_year, String status, String category, String author, String publisher) {
        this.book_id = book_id;
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.publication_year = publication_year;
        this.status = status;
        this.category = category;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
 
}
