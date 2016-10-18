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
public class Degree {
    
    private String name;
    private String description;
    private ArrayList<Course> coreCourseList;
    private ArrayList<Course> electiveCourseList;
    
    public Degree(){
        coreCourseList = new ArrayList<Course>();
        electiveCourseList = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Course> getCoreCourseList() {
        return coreCourseList;
    }

    public ArrayList<Course> getElectiveCourseList() {
        return electiveCourseList;
    }
    
    //add course to Cores
    public void addCoreCourse(Course course){
        coreCourseList.add(course);
    }
    
    //add course to electives
    public void  addElectiveCourse(Course course){
        electiveCourseList.add(course);
    }
    
}
