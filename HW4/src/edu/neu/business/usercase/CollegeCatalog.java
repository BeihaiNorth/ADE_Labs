/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.usercase;

import edu.neu.business.usercase.College;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class CollegeCatalog {
     private ArrayList<College> collegeCatalog;
    
     public CollegeCatalog(){
        collegeCatalog = new ArrayList<College>();
    }

    public ArrayList<College> getCollegeCatalog() {
        return collegeCatalog;
    }

    public void setCollegeCatalog(ArrayList<College> collegeCatalog) {
        this.collegeCatalog = collegeCatalog;
    }
    
    public College addCollege() {
        College c = new College();
        collegeCatalog.add(c);
        return c;

    }

    public void removeCollege(College c) {
        collegeCatalog.remove(c);
    }
    
}
