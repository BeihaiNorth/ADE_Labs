/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.Course;

import java.util.ArrayList;

/**
 *
 * @author leslie
 */
public class Course {
    
    private String name;
    private int id;
    private String description;
    private double price;
    private int credit;
    private ArrayList<Course> preCourseList;
    private ArrayList<Course> followCourseList;
    private ArrayList<Degree> relatedDegree;        //core course of this degree
    private ArrayList<Degree> relevantDegree;       //elective course of this degree
    
    public Course(){
        preCourseList = new ArrayList<Course>();
        followCourseList = new ArrayList<Course>();
        relatedDegree = new ArrayList<Degree>();
        relatedDegree = new ArrayList<Degree>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    
    
    
    public ArrayList<Course> getPreCourseList() {
        return preCourseList;
    }
    
    public void addPreCourse(Course course){
        preCourseList.add(course);
    }


    public ArrayList<Course> getFollowCourseList() {
        return followCourseList;
    }
    
    public void addFollowCourse(Course course){
        followCourseList.add(course);
    }

    
    public boolean isCore(Degree degree){
        boolean isCore = false;
        for (Degree d : relatedDegree) {
            if (d.equals(degree)) {
                for (Course c : d.getCoreCourseList()) {
                    if(c.getName().equals(name)){
                        isCore = true;
                        break;
                    }
                }
                break;
            }
        }
        return isCore;
    }
    
    public boolean isElective(Degree degree){
        boolean isElective = false;
        for (Degree d : relevantDegree) {
            if (d.equals(degree)) {
                for (Course c : d.getCoreCourseList()) {
                    if(c.getName().equals(name)){
                        isElective = true;
                        break;
                    }
                }
                break;
            }
        }
        return isElective;
    }
    
    
    
    
    
    
}
