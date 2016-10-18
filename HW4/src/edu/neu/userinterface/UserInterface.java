/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.userinterface;

import edu.neu.business.Course.Course;
import edu.neu.business.usercase.Department;
import edu.neu.business.usercase.EcoSystem;
import edu.neu.business.Initialization;
import edu.neu.business.student.Student;
import edu.neu.business.usercase.College;
import edu.neu.business.usercase.University;
import edu.neu.business.usercase.UniversityCatalog;
import java.util.Scanner;

/**
 *
 * @author mwhai_000
 */
public class UserInterface {

    public static void main(String[] args) {
        // TODO code application logic here



        System.out.println("*********Welcome to the EDUCATION LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports*************** ");
        System.out.println("1.DEPARTMENT LEVEL REPORTS");
        System.out.println("2.COLLEGE LEVEL REPORTS");
        System.out.println("3.UNIVERSITY LEVEL REPORTS");
        System.out.println("4.EDUCATION ECO SYSTEM REPORTS");
        System.out.println("5.VIEW ALL STUDENT");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice. Please enter a number for example just enter 1 for department level reports");
        int choice = reader.nextInt(); // Scans the next token of the input as an int.

        switch (choice) {
            case 1:
                //Retrieving the values from the Initialization file
//1

                System.out.println("***************DEPARTMENT LEVEL REPORTS STARTS******************");

                System.out.println("University   College   Department   Student Num   Alumni Num  Avg Salary    Employment(%)   Promotion(%)   Teacher Num   Research Num   Research Money   Staff Num   cost Avg     GPA Avg");
                for (University u : Initialization.initializeEcoSystem().getUniversityCatalog().getUniversityCatalog()) {
                    System.out.println(u.getUniversityName());
                    for (College c : u.getCollegeCatalog().getCollegeCatalog()) {
                        System.out.println("             " + c.getCollegeName());
                        for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                            System.out.println(
                                    "                           " + d.getDepartmentName()
                                    + "          " + d.getStudentNum()
                                    + "             " + d.alumniCount()
                                    + "          " + String.format("%.2f", d.salaryAvg())
                                    + "          " + String.format("%.2f", d.employmentRate())
                                    + "          " + String.format("%.2f", d.promotionRate())
                                    + "          " + d.getTeacherNum()
                                    + "            " + d.ResearchNum()
                                    + "            " + d.ResearchMoney()
                                    + "           " + d.getStaffNum()
                                    +"         " + d.costAvg()
                                    +"         " + String.format("%.2f", d.gpaAvg())
                            );
                        }
                    }
                }
                System.out.println("***************DEPARTMENT LEVEL REPORT ENDS******************");
                break;
            case 2:
                System.out.println("***************COLLEGE LEVEL REPORTS STARTS******************");
                System.out.println("University   College   Student Num   Alumni Num  Avg Salary    Employment(%)   Promotion(%)   Teacher Num   Research Num   Research Money   Staff Num   cost Avg     GPA Avg");
                for (University u : Initialization.initializeEcoSystem().getUniversityCatalog().getUniversityCatalog()) {
                    System.out.println(u.getUniversityName());
                    for (College c : u.getCollegeCatalog().getCollegeCatalog()) {
                        System.out.println("             " + c.getCollegeName()
                                + "          " + c.getStudentNum()
                                + "             " + c.getAlumniNum()
                                + "          " + String.format("%.2f", c.salaryAvg())
                                + "          " + String.format("%.2f", c.employmentRate())
                                + "          " + String.format("%.2f", c.promotionRate())
                                + "          " + c.getTeacherNum()
                                + "            " + c.ResearchNum()
                                + "            " + c.getResearchMoney()
                                + "           " + c.getStaffNum()
                                +"         " + c.costAvg()
                                    +"         " + String.format("%.2f", c.gpaAvg())
                        );
                    }
                }

                System.out.println("***************COLLEGE LEVEL REPORT ENDS******************");
                break;
            case 3:
                System.out.println("***************UNIVERSITY LEVEL REPORTS STARTS******************");
                System.out.println("University  Student Num   Alumni Num  Avg Salary   Employment(%)   Promotion(%)   Teacher Num   Research Num   Research Money   Staff Num   cost Avg     GPA Avg");
                for (University u : Initialization.initializeEcoSystem().getUniversityCatalog().getUniversityCatalog()) {
                    System.out.println(u.getUniversityName()
                            + "          " + u.getStudentNum()
                            + "             " + u.getAlumniNum()
                            + "          " + String.format("%.2f", u.salaryAvg())
                            + "       " + String.format("%.2f", u.employmentRate())
                            + "           " + String.format("%.2f", u.promotionRate())
                            + "           " + u.getTeacherNum()
                            + "             " + u.ResearchNum()
                            + "             " + u.getResearchMoney()
                            + "           " + u.getStaffNum()
                            +"         " + u.costAvg()
                             +"         " + String.format("%.2f",u.gpaAvg())
                    );
                }
                System.out.println("***************UNIVERSITY LEVEL REPORT ENDS******************");
                break;
            case 4:
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORTS STARTS******************");
                System.out.println("EcoSystem  Student Num   Alumni Num  Avg Salary   Employment(%)   Promotion(%)   Teacher Num   Research Num   Research Money   Staff Num   cost Avg     GPA Avg");
                EcoSystem eco = Initialization.initializeEcoSystem();
                System.out.println(eco.getEcoSystemName()
                        + "          " + eco.getStudentNum()
                        + "          " + eco.getAlumniNum()
                        + "          " + String.format("%.2f", eco.salaryAvg())
                        + "       " + String.format("%.2f", eco.employmentRate())
                        + "           " + String.format("%.2f", eco.promotionRate())
                        + "           " + eco.getTeacherNum()
                        + "           " + eco.ResearchNum()
                        + "           " + eco.getResearchMoney()
                        + "           " + eco.getStaffNum()
                        +"         " + eco.costAvg()
                                    +"         " + String.format("%.2f", eco.gpaAvg())
                        
                );

                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORT ENDS******************");
                break;
    
             case 5:
                System.out.println("***************STUDENT REPORTS STARTS******************");
                for (University u : Initialization.initializeEcoSystem().getUniversityCatalog().getUniversityCatalog()) {
                    System.out.println( u.getUniversityName());
                    for (College c : u.getCollegeCatalog().getCollegeCatalog()) {
                        System.out.println("   " + c.getCollegeName());
                        for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                            System.out.println("   " + d.getDepartmentName());
                            for(Student s : d.getStudentDirectory().getStudentDirectory())
                            {   System.out.println(s.getStudentName() + "   " +s.getId() +"   " + String.format("%.2f",s.getTranscript().calSemesterCost())+ "   " +s.getTranscript().calSemesterGPA());
                            }
                        }
                    }
                }
                        


                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORT ENDS******************");
                break;
            default:
                System.out.println("INPUT ENTERED IS INCORRECT ASK USER FOR THE INPUT AGAIN EXPLORE WHILE/Do-While loops");
                break;
        }
    }

}
