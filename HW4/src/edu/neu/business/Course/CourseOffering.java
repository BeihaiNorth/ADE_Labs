/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.Course;


import edu.neu.business.faculty.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leslie
 */
public class CourseOffering {
    private Course course;
    private Teacher teacher;
                    //students that sign up this course
    private Classroom classroom;
//    private date startDate;
//    private date endDate;
    
    
    private List<Seat> seatList; 

    public CourseOffering() {
         seatList = new ArrayList<Seat>(); 
    }
    
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    
        public Seat addSeat(){
        Seat s = new Seat();
        seatList.add(s);
        return s;
    }
    
}
