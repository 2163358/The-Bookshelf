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
public class Borrower {
   private int borrower_id;
   private String fname;
   private String lname;
   private String mname;
   private char gender;
   private String email_address;
   private String contact_no;
   private String current_address;
   private String borrower_type;

    public Borrower(int borrower_id, String fname, String lname, String mname, char gender, String email_address, String contact_no, String current_address, String borrower_type) {
        this.borrower_id = borrower_id;
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.gender = gender;
        this.email_address = email_address;
        this.contact_no = contact_no;
        this.current_address = current_address;
        this.borrower_type = borrower_type;
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
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the mname
     */
    public String getMname() {
        return mname;
    }

    /**
     * @param mname the mname to set
     */
    public void setMname(String mname) {
        this.mname = mname;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the email_address
     */
    public String getEmail_address() {
        return email_address;
    }

    /**
     * @param email_address the email_address to set
     */
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    /**
     * @return the contact_no
     */
    public String getContact_no() {
        return contact_no;
    }

    /**
     * @param contact_no the contact_no to set
     */
    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    /**
     * @return the current_address
     */
    public String getCurrent_address() {
        return current_address;
    }

    /**
     * @param current_address the current_address to set
     */
    public void setCurrent_address(String current_address) {
        this.current_address = current_address;
    }

    /**
     * @return the borrower_type
     */
    public String getBorrower_type() {
        return borrower_type;
    }

    /**
     * @param borrower_type the borrower_type to set
     */
    public void setBorrower_type(String borrower_type) {
        this.borrower_type = borrower_type;
    }
   
}
