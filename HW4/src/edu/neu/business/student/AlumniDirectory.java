/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mwhai_000
 */
public class AlumniDirectory {
     private ArrayList<Alumni> alumniDirectory;
     
     public AlumniDirectory(){
        alumniDirectory = new ArrayList<Alumni>();
    }

    public ArrayList<Alumni> getAlumniDirectory() {
        return alumniDirectory;
    }

    public void setAlumniDirectory(ArrayList<Alumni> alumniDirectory) {
        this.alumniDirectory = alumniDirectory;
    }
    
    public Alumni addAlumni() {
        Alumni a = new Alumni();
        alumniDirectory.add(a);
        return a;
    }

    public void removeAlumni(Alumni a) {
        alumniDirectory.remove(a);
    }
     
    public int alumniCount(){
        int count = 0;
//         for (Alumni a : alumniDirectory) {
//             count++;         
//         }
        count = alumniDirectory.size();
        System.out.println("There is "+count+" alumni in this department.");
        return count;
    }
    
    public double salaryAvg(){
        double salarySum = 0.0;
        double sum = 0;
        for (Alumni a :alumniDirectory) {
            sum++;
            salarySum += a.getSalary();
        }         
        double salaryAvg = salarySum / sum;
         System.out.println(salaryAvg);
        return salaryAvg;
    }
    
    public double employmentRate(){
        double count = 0;
        double sum = 0;
         for (Alumni a : alumniDirectory) {
            sum++;
            if(a.isEmployed()){
                count++;
            }         
         }
        double rate = count / sum *100;
        System.out.println(rate+"% of alumni get employed.");
        return rate;
    }
    
    public double promotionRate(){
        double count = 0;
        double sum = 0;
         for (Alumni a : alumniDirectory) {
            if(a.isEmployed()){
                sum++;
                if(a.isPromoted()){
                count++;
                } 
            }                     
         }
        double rate = count / sum *100;
        System.out.println(rate+"% of alumni get promoted.");
        return rate;
    }
}
