/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.student;

/**
 *
 * @author mwhai_000
 */
public class Alumni{
    private String alunmiName;
    private boolean employed;
    private boolean promoted;
    private double Salary;
    private double SalaryAfter5Year;

    public String getAlunmiName() {
        return alunmiName;
    }

    public void setAlunmiName(String alunmiName) {
        this.alunmiName = alunmiName;
    }
        
    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getSalaryAfter5Year() {
        return SalaryAfter5Year;
    }

    public void setSalaryAfter5Year(double SalaryAfter5Year) {
        this.SalaryAfter5Year = SalaryAfter5Year;
    }

    
    
    
}
