/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.Course;

import edu.neu.business.faculty.Teacher;
import java.util.ArrayList;

/**
 *
 * @author leslie
 */
public class CourseSchedule {
    
    private ArrayList<CourseOffering> courseOfferingList;

    public CourseSchedule(){
        courseOfferingList = new ArrayList<CourseOffering>();
    }
    
    public ArrayList<CourseOffering> getCourseOfferingList() {
        return courseOfferingList;
    }
    
    //Add a course to the course schedule
    public CourseOffering addCourseOffering(){
        CourseOffering courseOffering = new CourseOffering();
        courseOfferingList.add(courseOffering);
        return courseOffering;
    }
    
    //Assign a teacher to teach a scheduled course
    public void assignTeacher(Teacher teacher, Course course){
        for (CourseOffering courseOffering : courseOfferingList) {
            if (courseOffering.getCourse().equals(course)) {
                courseOffering.setTeacher(teacher);
                break;
            }
        }
    }

    
    
}
