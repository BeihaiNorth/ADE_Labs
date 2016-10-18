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
public class JobPostionDirectory {
    private ArrayList<Teacher> teacherDirectory;
    
    public JobPostionDirectory(){
        teacherDirectory = new ArrayList<Teacher>();
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
    
}
