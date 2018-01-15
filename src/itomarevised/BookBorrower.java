/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itomarevised;

/**
 *
 * @author asus
 */
public class BookBorrower {
    
    private int bookID;
    private String isbn;
    private String title;
    private int borrowerID;
    private String borrowername;
    private String borrowed_date;
    private String duedate;

    public BookBorrower(int bookID, String isbn, String title, int borrowerID, String borrowername, String borrowed_date, String duedate) {
        this.bookID = bookID;
        this.isbn = isbn;
        this.title = title;
        this.borrowerID = borrowerID;
        this.borrowername = borrowername;
        this.borrowed_date = borrowed_date;
        this.duedate = duedate;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
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

    public int getBorrowerID() {
        return borrowerID;
    }

    public void setBorrowerID(int borrowerID) {
        this.borrowerID = borrowerID;
    }

    public String getBorrowername() {
        return borrowername;
    }

    public void setBorrowername(String borrowername) {
        this.borrowername = borrowername;
    }

    public String getBorrowed_date() {
        return borrowed_date;
    }

    public void setBorrowed_date(String borrowed_date) {
        this.borrowed_date = borrowed_date;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
            
}
