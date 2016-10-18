/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business;

import edu.neu.business.Course.CourseLoad;
import edu.neu.business.Course.SeatAssignment;

/**
 *
 * @author mwhai_000
 */
public class Transcript {
        
    private CourseLoad courseload;

    public Transcript() {
        courseload = new CourseLoad();
    }

    
    public CourseLoad getCourseload() {
        return courseload;
    }
    
    public double calSemesterGPA(){
        double GPA = 0;


        double GPASum = 0.0;
        
        for(SeatAssignment sa : getCourseload().getSeatAssignmentList()){
            
            GPASum += sa.getCourseGrade();
        }
        
       GPA = GPASum/getCourseload().getSeatAssignmentList().size();
        return GPA;
    }
    
    public double calSemesterCost(){
        double cost = 0;

        for(SeatAssignment sa : getCourseload().getSeatAssignmentList()){
            cost += sa.getCourseCost();
        }
        return cost;
    }
   
    public double courseCount(){
        int count = 0;
        count = getCourseload().getSeatAssignmentList().size();
        return count;
    }
}
