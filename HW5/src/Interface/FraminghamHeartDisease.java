/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.City;
import Business.Community;
import Business.CommunityDirectory;
import Business.Family;
import Business.FamilyDirectory;
import Business.House;
import Business.HouseDirectory;
import Business.Patient;
import Business.Person;
import Business.PersonDirectory;
import Business.VitalSigns;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author leslie
 */
public class FraminghamHeartDisease {

    public static void main(String[] args) {
        // TODO code application logic here

        Configuration config = new Configuration();
        config.initNameArray();
        PersonDirectory pd = config.initPersonDirectory();
        FamilyDirectory fd = config.initFamilyDirectory();
        HouseDirectory hd = config.initHouseDirectory();
        CommunityDirectory cd = config.initCommunityDirectory();
        City city = config.initCity();
        
        System.out.println("************WELCOME TO FRAMINGHAM HEART STUDY***************************");
        System.out.println("************Please enter choice below for Use Cases*********************");
        System.out.println("1.CALCULATE YOUR RISK OF DEVELOPPING HEART DISEASE");
        System.out.println("2.SEARCH YOUR PERSONAL HEALTH STATUS");
        System.out.println("3.VIEW REPORT AT EACH LEVEL OF THE CITY");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your choice:");
        int choice = reader.nextInt();

        switch (choice) {
            case 1:
                System.out.println("************WELCOME TO HEART DISEASE CALCULATOR**************************");
                Person user = new Person();
                reader = new Scanner(System.in);
                System.out.println("Please enter your age (Age must be an integer between 30 and 100):");
                int age = reader.nextInt();
                if (age >= 30 && age <= 100) {
                    user.setAge(age);
                } else {
                    System.out.println("Please enter a valid age (must be an integer between 30 and 100)");
                }

                reader = new Scanner(System.in);
                System.out.println("Please enter your gender (1 for male and 0 for female)");
                int gender = reader.nextInt();
                if (gender == 1) {
                    user.setIsMale(true);
                } else if (gender == 0) {
                    user.setIsMale(false);
                } else {
                    System.out.println("Please enter 1 for male and 0 for female");
                }

                reader = new Scanner(System.in);
                System.out.println("Smoker (1 for YES and 0 for NO)");
                int smoker = reader.nextInt();
                if (smoker == 1) {
                    user.getPatient().setSmoker(true);
                } else if (smoker == 0) {
                    user.getPatient().setSmoker(false);
                } else {
                    System.out.println("Please enter 1 for YES and 0 for NO");
                }
                reader = new Scanner(System.in);
                System.out.println("Diabetes (1 for YES and 0 for NO)");
                int diabetes = reader.nextInt();
                if (diabetes == 1) {
                    user.getPatient().setDiabetes(true);
                } else if (diabetes == 0) {
                    user.getPatient().setDiabetes(false);
                } else {
                    System.out.println("Please enter 1 for YES and 0 for NO");
                }

                reader = new Scanner(System.in);
                System.out.println("Please enter your total cholesterol in mmol/L  (between 3.6 and 10.3)");
                double total = reader.nextDouble();

                reader = new Scanner(System.in);
                System.out.println("Please enter your systolic HDL cholesterol in mmol/L (between 0.8 and 4.0)");
                double HDL = reader.nextDouble();

                reader = new Scanner(System.in);
                System.out.println("Please enter your systolic blood pressure in mm Hg (between 90 and 200)");
                double bp = reader.nextDouble();

                Date now = new java.util.Date();
                Timestamp timeStamp = new Timestamp(now.getTime());
                user.getPatient().addVitalSigns(bp, total, HDL, timeStamp);

                System.out.println("************YOUR PERSONAL HEART DISEASE REPORT*********************");
                System.out.println("************YOUR FRAMINGHAM RISK SCORE IS**************************");
                System.out.println(user.getPatient().getScore(user));
                System.out.println("************YOUR RISK OF DEVELOPPING HEART DISEASE IS**************");
                System.out.println(user.getPatient().getRisk(user) + "%");

                break;
            
            case 2:
                System.out.println("******************Reports*************************"); 
                
                //search person by ID number
                reader = new Scanner(System.in);
                System.out.println("Please enter your ID (between 0001 - 3000)");
                int id  = reader.nextInt();
                Person searchedPerson = new Person();
                if (id<0 || id>3000) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid ID nember");
                }else{
                    for (Person p : pd.getPersonDirectory()) {
                        
                        if (p.getID() == id) {
                            searchedPerson = p;
                            break;
                        }
                    }
                }
                //print searched Person's information
                System.out.println("\nName-->" + searchedPerson.getName()
                    + "   ID-->" + searchedPerson.getID()
                    + "   AGE-->" + searchedPerson.getAge()
                    + "   SEX-->" + searchedPerson.isIsMale()
                );
                System.out.println("Vital Sign History:");
                System.out.println("TimeStamp               Blood Pressure   HDL Cholesterol   Total Cholesterol");
                for (VitalSigns vs : searchedPerson.getPatient().getVitalSignsList()) {
                System.out.println(
                    vs.getTimeStamp()
                    + "     " + String.format("%.2f", vs.getBloodPressure())
                    + "           " + String.format("%.2f", vs.getHDLCholesterol())
                    + "                " + String.format("%.2f", vs.getTotalCholesterol())
                    );
                }

                System.out.println("Average                   "
                    + String.format("%.2f", searchedPerson.getPatient().getAvgBP())
                    + "           " + String.format("%.2f", searchedPerson.getPatient().getAvgHDLCholesterol())
                    + "                " + String.format("%.2f", searchedPerson.getPatient().getAvgTotalCholesterol())
                    + "\nSmoker-->" + searchedPerson.getPatient().isSmoker()
                    + "   Diabetes-->" + searchedPerson.getPatient().isDiabetes()
                    + "\nScore-->" + searchedPerson.getPatient().getScore(searchedPerson)
                    + "   Risk-->" + searchedPerson.getPatient().getRisk(searchedPerson) + "%"
                );
                //print searched person's family information
                System.out.println("    ");
                System.out.println("Family members' info:");
                if (id < 1000) {   //if a child
                    System.out.println("Father         : " +"ID" + searchedPerson.getFather().getID() +"  "+ searchedPerson.getFather().getName());
                    System.out.println("Mother         : " +"ID" + searchedPerson.getMother().getID() +"  "+ searchedPerson.getMother().getName());
                    System.out.println("Sibling        : " +"ID" + String.format("%04d", searchedPerson.getSiblings().getID()) +"  "+ searchedPerson.getSiblings().getName());
                    System.out.println("Father's father: " +"ID" + String.format("%04d", searchedPerson.getFather().getFather().getID()) +"  "+ searchedPerson.getFather().getFather().getName());
                    System.out.println("Father's mother: " +"ID" + searchedPerson.getFather().getMother().getID() +"  "+ searchedPerson.getFather().getMother().getName());
                    System.out.println("Mother's father: " +"ID" + searchedPerson.getFather().getFather().getID() +"  "+ searchedPerson.getFather().getFather().getName());
                    System.out.println("Mother's mother: " +"ID" + searchedPerson.getFather().getMother().getID() +"  "+ searchedPerson.getFather().getMother().getName());
                }
                if(id>=1000 && id<1500){    //if a father
                    System.out.println("Father    : " +"ID" + searchedPerson.getFather().getID() +"  "+  searchedPerson.getFather().getName());
                    System.out.println("Mother    : " +"ID" + searchedPerson.getMother().getID() +"  "+ searchedPerson.getMother().getName());
                    for (Person p : searchedPerson.getFamily().getFamilyMembers()) {
                        if ( p.getAge()>30 && (p.isIsMale()==false)) {
                            System.out.println("Wife      : " +"ID" + p.getID() +"  "+ p.getName());
                        }
                    }
                    System.out.println("Sibling   : " +"ID" + String.format("%04d", searchedPerson.getSiblings().getID()) +"  "+ searchedPerson.getSiblings().getName());
                    System.out.println("child1    : " +"ID" + String.format("%04d", searchedPerson.getChild1().getID()) +"  "+ searchedPerson.getChild1().getName());
                    System.out.println("child2    : " +"ID" + String.format("%04d", searchedPerson.getChild2().getID()) +"  "+ searchedPerson.getChild2().getName());
                }
                if(id>=1500 && id<2000){    //if a mother
                    System.out.println("Father    : " +"ID" + searchedPerson.getFather().getID() +"  "+  searchedPerson.getFather().getName());
                    System.out.println("Mother    : " +"ID" + searchedPerson.getMother().getID() +"  "+ searchedPerson.getMother().getName());
                    for (Person p : searchedPerson.getFamily().getFamilyMembers()) {
                        if ( p.getAge()>30 && (p.isIsMale()==false)) {
                            System.out.println("husband   : " +"ID" + p.getID() +"  "+ p.getName());
                        }
                    }
                    System.out.println("Sibling   : " +"ID" + String.format("%04d", searchedPerson.getSiblings().getID()) +"  "+ searchedPerson.getSiblings().getName());
                    System.out.println("child1    : " +"ID" + String.format("%04d", searchedPerson.getChild1().getID()) +"  "+ searchedPerson.getChild1().getName());
                    System.out.println("child2    : " +"ID" + String.format("%04d", searchedPerson.getChild2().getID()) +"  "+ searchedPerson.getChild2().getName());
                }
                if (id>=2000) {  //if senior
                    System.out.println("Son                 :" + "ID" + searchedPerson.getChild1().getID() + "  " + searchedPerson.getChild1().getName());
                    System.out.println("Daughter            :" + "ID" + searchedPerson.getChild2().getID() + "  " + searchedPerson.getChild2().getName());
                    System.out.println("Son's children      :" + "ID" + String.format("%04d", searchedPerson.getChild1().getChild1().getID()) + "  " + searchedPerson.getChild1().getChild1().getName());
                    System.out.println("                     " + "ID" + String.format("%04d", searchedPerson.getChild1().getChild2().getID()) + "  " + searchedPerson.getChild1().getChild2().getName());
                    System.out.println("Daughter's children :" + "ID" + String.format("%04d", searchedPerson.getChild2().getChild1().getID()) + "  " + searchedPerson.getChild2().getChild1().getName());
                    System.out.println("                     " + "ID" + String.format("%04d", searchedPerson.getChild2().getChild2().getID()) + "  " + searchedPerson.getChild2().getChild2().getName());
                }
                break;


                
                
            
            case 3:
                System.out.println("******************Reports*************************");

                System.out.println("*********Welcome to the CITY LEVEL ECOSYSTEM*************** ");
                System.out.println("*********Please enter the choice below for Reports*************** ");
                System.out.println("1.CITY LEVEL REPORTS");
                System.out.println("2.COMMUNITY LEVEL REPORTS");
                System.out.println("3.HOUSE LEVEL REPORTS");
                System.out.println("4.FAMILY LEVEL REPORTS");
                System.out.println("5.PERSON LEVEL REPORTS");

                //Your switch statements.
                reader = new Scanner(System.in);  // Reading from System.in
                System.out.println("Enter a choice. Please enter a number for example just enter 1 for city level reports");
                int choice2 = reader.nextInt(); // Scans the next token of the input as an int.

                switch (choice2) {
                    case 1:
                        System.out.println("***************CITY LEVEL REPORTS STARTS******************");
                        System.out.println(String.format("%.2f",city.getAvgScore())+ 
                                "\n" +String.format("%.2f",city.getAvgRisk())+ "%" +
                                "\n"+ city.getHighRiskNum());
                        break;
                    case 2:
                        System.out.println("***************COMMUNITY LEVEL REPORTS STARTS******************");
                        System.out.println("***************HOUSE LEVEL REPORTS STARTS******************");
                        for (Community c : cd.getCommunityDirectory()) {
                            System.out.println(
                                    c.getCommunityID()
                                    + "                " + String.format("%.2f", c.getAvgScore())
                                    + "       " + String.format("%.2f", c.getAvgRisk()));
                        }
                        break;
                    case 3:
                        System.out.println("***************HOUSE LEVEL REPORTS STARTS******************");
                        for (House h : hd.getHouseDirectory()) {
                            System.out.println(
                                    h.getHouseID()
                                    + "                " + String.format("%.2f", h.getAvgScore())
                                    + "       " + String.format("%.2f", h.getAvgRisk()));
                        }
                        break;
                    case 4:
                        System.out.println("***************FAMILY LEVEL REPORTS STARTS******************");
                        System.out.println("Family Number   Avg Score   Avg Risk ");
                        for (Family f : fd.getFamilyDirectory()) {
                            System.out.println(
                                    f.getFamilyID()
                                    + "                " + String.format("%.2f", f.getAvgScore())
                                    + "       " + String.format("%.2f", f.getAvgRisk()));
                        }
                        break;
                    case 5:
                        System.out.println("***************PERSON LEVEL REPORTS STARTS******************");

                        System.out.println("***************My Random Data***************************");
                        for (int i = 0; i < 3000; i++) {
                            Person p = pd.getPersonDirectory().get(i);
                            System.out.println("\nName-->" + p.getName()
                                    + "   ID-->" + p.getID()
                                    + "   AGE-->" + p.getAge()
                                    + "   SEX-->" + p.isIsMale()
                            );
                            System.out.println("Vital Sign History:");
                            System.out.println("TimeStamp               Blood Pressure   HDL Cholesterol   Total Cholesterol");
                            for (VitalSigns vs : p.getPatient().getVitalSignsList()) {
                                System.out.println(
                                        vs.getTimeStamp()
                                        + "     " + String.format("%.2f", vs.getBloodPressure())
                                        + "           " + String.format("%.2f", vs.getHDLCholesterol())
                                        + "                " + String.format("%.2f", vs.getTotalCholesterol())
                                );
                            }

                            System.out.println("Average                   "
                                    + String.format("%.2f", p.getPatient().getAvgBP())
                                    + "           " + String.format("%.2f", p.getPatient().getAvgHDLCholesterol())
                                    + "                " + String.format("%.2f", p.getPatient().getAvgTotalCholesterol())
                                    + "\nSmoker-->" + p.getPatient().isSmoker()
                                    + "   Diabetes-->" + p.getPatient().isDiabetes()
                                    + "\nScore-->" + p.getPatient().getScore(p)
                                    + "   Risk-->" + p.getPatient().getRisk(p) + "%"
                            );
                        }
                }
        }

    }
}
