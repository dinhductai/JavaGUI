/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javtest;

/**
 *
 * @author admin
 */
public class SvModel {
    private int id;
    private String name;
    private String atclass;
    private double grade;

    public SvModel() {
    }

    public SvModel(int id, String name, String atclass, double grade) {
        this.id = id;
        this.name = name;
        this.atclass = atclass;
        this.grade = grade;
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

    public String getAtclass() {
        return atclass;
    }

    public void setAtclass(String atclass) {
        this.atclass = atclass;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
}
