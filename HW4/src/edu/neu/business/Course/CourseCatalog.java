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
public class CourseCatalog {
    private ArrayList<Course> courseCatalog;

    public CourseCatalog(){
        courseCatalog = new ArrayList<Course>();
    }
    
    public ArrayList<Course> getCourseCatalog() {
        return courseCatalog;
    }

    public void addCourse(Course course){
        courseCatalog.add(course);
     
    }
    
//    public Course addCourse() {
//        Course c = new Course();
//        courseCatalog.add(c);
//        return c;
//    }
    public Course searchCourse(String name){
        Course course = null;
        for (Course c : courseCatalog) {
            if (c.getName().equals(name)) {
                course = c;
                break;
            }
        }
        
        return course;
    }
    
    public Course searchCourse(int courseid){
        Course course = null;
        for (Course c : courseCatalog) {
            if ( c.getID() == courseid ) {
                course = c;
                break;
            }
        }
        return course;
    }

}
