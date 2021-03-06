/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.usercase;

import edu.neu.business.student.Alumni;
import edu.neu.business.student.Student;

/**
 *
 * @author mwhai_000
 */
public class College {
    private String collegeName;
    
    private DepartmentCatalog departmentCatalog;
    
    public College(){
        departmentCatalog = new DepartmentCatalog();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public DepartmentCatalog getDepartmentCatalog() {
        return departmentCatalog;
    }

    public void setDepartmentCatalog(DepartmentCatalog departmentCatalog) {
        this.departmentCatalog = departmentCatalog;
    }
    
    public int getStudentNum() {
        int count = 0;
        for (Department depart : getDepartmentCatalog().getDepartmentCatalog()) {
            count += depart.getStudentNum();
        }
        return count;
    }

    public int getAlumniNum() {
        int count = 0;
        for (Department depart : getDepartmentCatalog().getDepartmentCatalog()) {
            count += depart.alumniCount();
        }
        return count;
    }

    public int getTeacherNum() {
        int count = 0;
        for (Department depart : getDepartmentCatalog().getDepartmentCatalog()) {
            count += depart.getTeacherNum();
        }
        return count;
    }

    public int getStaffNum() {
        int count = 0;
        for (Department depart : getDepartmentCatalog().getDepartmentCatalog()) {
            count += depart.getStaffNum();
        }
        return count;
    }

    public int ResearchNum() {
        int researchSum = 0;
        for (Department depart : getDepartmentCatalog().getDepartmentCatalog()) {
            researchSum += depart.ResearchNum();
        }
        return researchSum;
    }

    public double getResearchMoney() {
        double researchMoney = 0.0;
        for (Department depart : getDepartmentCatalog().getDepartmentCatalog()) {
            researchMoney += depart.ResearchMoney();
        }
        return researchMoney;
    }

    public double salaryAvg() {
        double salarySum = 0.0;
        double sum = 0;
        for (Department d : getDepartmentCatalog().getDepartmentCatalog()) {
            sum += d.alumniCount();
            for (Alumni a : d.getAlumniDirectory().getAlumniDirectory()) {
                salarySum += a.getSalary();
            }
        }
        double salaryAvg = salarySum / sum;
        return salaryAvg;
    }

    public double employmentRate() {
        double count = 0;
        double sum = 0;
        double rate = 0;
        for (Department d : getDepartmentCatalog().getDepartmentCatalog()) {
            sum += d.alumniCount();
            for (Alumni a : d.getAlumniDirectory().getAlumniDirectory()) {
                if (a.isEmployed()) {
                    count++;
                }
            }
        }
        rate = count / sum * 100;
        return rate;
    }

    public double promotionRate() {
        double count = 0;
        double sum = 0;
        for (Department d : getDepartmentCatalog().getDepartmentCatalog()) {
            for (Alumni a : d.getAlumniDirectory().getAlumniDirectory()) {
                if (a.isEmployed()) {
                    sum++;
                    if (a.isPromoted()) {
                        count++;
                    }
                }
            }
        }
        double rate = count / sum * 100;
        return rate;
    }
    
    public double gpaAvg(){
        double gpaSum = 0.0;
        double sum = 0;
        for (Department d : getDepartmentCatalog().getDepartmentCatalog()){
            for (Student s :d.getStudentDirectory().getStudentDirectory()) {
                sum++;
                gpaSum += s.getTranscript().calSemesterGPA();
            }         
        }
        double salaryAvg = gpaSum / sum;
        return salaryAvg;
    }
    
    public double costAvg(){
        double costSum = 0.0;
        double sum = 0;
        for (Department d : getDepartmentCatalog().getDepartmentCatalog()){
            for (Student s :d.getStudentDirectory().getStudentDirectory()) {
                    sum++;
                    costSum += s.getTranscript().calSemesterCost();
            }
        }
        double salaryAvg = costSum / sum;
        return salaryAvg;
    }
}
