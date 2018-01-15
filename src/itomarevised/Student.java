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
public class Student {
    
    private int studid;
    private String course;
    private int year;
    private int borid;

    public Student(int studid, String course, int year, int borid) {
        this.studid = studid;
        this.course = course;
        this.year = year;
        this.borid = borid;
    }

    public int getStudid() {
        return studid;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBorid() {
        return borid;
    }

    public void setBorid(int borid) {
        this.borid = borid;
    }
    
}
