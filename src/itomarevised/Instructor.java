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
public class Instructor {
    
    private int inst_id;
    private String dept;
    private int borid;

    public Instructor(int inst_id, String dept, int borid) {
        this.inst_id = inst_id;
        this.dept = dept;
        this.borid = borid;
    }

    public int getInst_id() {
        return inst_id;
    }

    public void setInst_id(int inst_id) {
        this.inst_id = inst_id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getBorid() {
        return borid;
    }

    public void setBorid(int borid) {
        this.borid = borid;
    }
        
}
