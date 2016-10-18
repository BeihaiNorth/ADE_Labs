/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.faculty;

/**
 *
 * @author mwhai_000
 */
public class Teacher {
    private String teacherName;
    private String id;
    private String title;
    private int researchNum;
    private double researchMoney;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getResearchNum() {
        return researchNum;
    }

    public void setResearchNum(int researchNum) {
        this.researchNum = researchNum;
    }



    public double getResearchMoney() {
        return researchMoney;
    }

    public void setResearchMoney(double researchMoney) {
        this.researchMoney = researchMoney;
    }

    
    
}
