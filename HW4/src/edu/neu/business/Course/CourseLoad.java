/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.Course;

import edu.neu.business.Transcript;
import java.util.ArrayList;
import edu.neu.business.Course.SeatAssignment;
/**
 *
 * @author leslie
 * The Course Load class is responsible for the student courses in any given semester. 
 * It is the set or collection of courses the student took in a semester. 
 * It answers the question “What courses did the student complete in a given semester. 
 * 
 */
public class CourseLoad {
    
    private Semester semesterList;
   private ArrayList<SeatAssignment> seatAssignmentList;
    
    public CourseLoad(){
        semesterList = new Semester();
        seatAssignmentList = new ArrayList<SeatAssignment>();

    }

    public ArrayList<SeatAssignment> getSeatAssignmentList() {
        return seatAssignmentList;
    }

    
    
        public SeatAssignment AddSeatAssignment(Seat seat, double grade, double cost){
        SeatAssignment sa = new SeatAssignment();
        sa.setSeat(seat);
        sa.setCourseGrade(grade);
        sa.setCourseCost(cost);
        
        seatAssignmentList.add(sa);
        return sa;
    }
    
        
        
    public double calSemesterGPA(){
     double semesterGPA = 0;
     
//        int courseCount = 0;
//        double GPASum = 0.0;
//        
//        
//        for(CourseOffering co : getSemesterList().getCourseList())
//            {   
//                
//                for(SeatAssignment sa : co.getSeat().getSeat())
//                GPASum =+ sa.getCourseGrade();
//                courseCount++;
//            }
//        semesterGPA = GPASum/courseCount;
        return semesterGPA;
    }
    
    public double calCost(){
     double semesterGPA = 0;
//        int courseCount = 0;
//        double GPASum = 0.0;
//        
//        
//        for(CourseOffering co : getSemesterList().getCourseList())
//            {   
//                
//                for(SeatAssignment sa : co.getSeat().getSeat())
//                GPASum =+ sa.getCourseGrade();
//                courseCount++;
//            }
//        semesterGPA = GPASum/courseCount;
        return semesterGPA;
    }
    
}
