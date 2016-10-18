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
public class Semester {
    private Date startDate;
    private Date endDate;
    private ArrayList<CourseOffering> courseList;
    
    public Semester(){
        courseList = new ArrayList<>();
    }

    public ArrayList<CourseOffering> getCourseList() {
        return courseList;
    }
    
    
}
