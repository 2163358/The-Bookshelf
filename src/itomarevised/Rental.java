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
public class Rental {
    private int borrower_id;
    private int book_id;
    private String dateBorrowed;
    private String dueDate;
    private String dateReturned;
    private int overdue_fee;

    public Rental(int borrower_id, int book_id, String dateBorrowed, String dueDate, String dateReturned, int overdue_fee) {
        this.borrower_id = borrower_id;
        this.book_id = book_id;
        this.dateBorrowed = dateBorrowed;
        this.dueDate = dueDate;
        this.dateReturned = dateReturned;
        this.overdue_fee = overdue_fee;
    }
    /**
     * @return the borrower_id
     */
    public int getBorrower_id() {
        return borrower_id;
    }

    /**
     * @param borrower_id the borrower_id to set
     */
    public void setBorrower_id(int borrower_id) {
        this.borrower_id = borrower_id;
    }

    /**
     * @return the book_id
     */
    public int getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the dateBorrowed
     */
    public String getDateBorrowed() {
        return dateBorrowed;
    }

    /**
     * @param dateBorrowed the dateBorrowed to set
     */
    public void setDateBorrowed(String dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the dateReturned
     */
    public String getDateReturned() {
        return dateReturned;
    }

    /**
     * @param dateReturned the dateReturned to set
     */
    public void setDateReturned(String dateReturned) {
        this.dateReturned = dateReturned;
    }

    /**
     * @return the overdue_fee
     */
    public int getOverdue_fee() {
        return overdue_fee;
    }

    /**
     * @param overdue_fee the overdue_fee to set
     */
    public void setOverdue_fee(int overdue_fee) {
        this.overdue_fee = overdue_fee;
    }
}
