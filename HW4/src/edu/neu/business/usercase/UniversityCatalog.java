/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.usercase;

import edu.neu.business.usercase.University;
import edu.neu.business.student.Student;
import edu.neu.business.student.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class UniversityCatalog {
    private ArrayList<University> universityCatalog;
    
    public UniversityCatalog(){
        universityCatalog = new ArrayList<University>();    
    }

    public ArrayList<University> getUniversityCatalog() {
        return universityCatalog;
    }

    public University addUniversity() {
        University university = new University();
        universityCatalog.add(university);
        return university;
    }

    public void removeUniversity(University university) {
        universityCatalog.remove(university);
    }

    
}
