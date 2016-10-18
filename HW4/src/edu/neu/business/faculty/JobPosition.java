/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.faculty;

import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class JobPosition {
    private ArrayList<Teacher> teacherDirectory;
    private ArrayList<Staff> staffDirectory;
            
    public JobPosition(){
        teacherDirectory = new ArrayList<Teacher>();
        staffDirectory = new ArrayList<Staff>();
    }

    public ArrayList<Teacher> getTeacherDirectory() {
        return teacherDirectory;
    }
    
    public Teacher addTeacher() {
        Teacher t = new Teacher();
        teacherDirectory.add(t);
        return t;
    }
    
    public void removeTeacher(Teacher t) {
        teacherDirectory.remove(t);
    }

    public ArrayList<Staff> getStaffDirectory() {
        return staffDirectory;
    }
    
    public Staff addStaff() {
        Staff s = new Staff();
        staffDirectory.add(s);
        return s;
    }
    
    public void removeStaff(Staff s) {
        staffDirectory.remove(s);
    }
    
    public int teacherCount(){
        int count = 0;
        for (Teacher t : teacherDirectory) {
            count++;
        }         
        System.out.println("There are "+count+" students in this department.");
        return count;
    }
    
}
