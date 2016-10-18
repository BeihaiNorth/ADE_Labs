/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.usercase;

import edu.neu.business.usercase.Department;
import edu.neu.business.student.Student;
import edu.neu.business.student.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class DepartmentCatalog {
    private ArrayList<Department> departmentCatalog;
    
    public DepartmentCatalog(){
        departmentCatalog = new ArrayList<Department>();
    }

    public ArrayList<Department> getDepartmentCatalog() {
        return departmentCatalog;
    }
    
    public Department addDepartment() {
        Department d = new Department();
        departmentCatalog.add(d);
        return d;

    }

    public void removeDepartment(Department d) {
        departmentCatalog.remove(d);
    }
    
    


}
