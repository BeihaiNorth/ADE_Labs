/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.student;

import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class StudentDirectory {
    private ArrayList<Student> studentDirectory;
    
    
    public StudentDirectory(){
        studentDirectory = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentDirectory() {
        return studentDirectory;
    }
    
    public Student addStudent() {
        Student s = new Student();
        studentDirectory.add(s);
        return s;
    }

    public void removeStudent(Student s) {
        studentDirectory.remove(s);
    }

    
//        public double GPAAvg(){
//        double gpaSum = 0.0;
//        for (Student s : studentDirectory) {
//            gpaSum += s.getTranscript().calculateGPA();
//        }         
//        double gpaAvg = gpaSum / studentDirectory.size();
//         System.out.println(gpaAvg);
//        return gpaAvg;
//    }
}
