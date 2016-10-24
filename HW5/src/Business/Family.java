/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author leslie Assumptions: Two kinds of family: 1. People age from 31~60 and
 * their spouse and their children form a family; 2. People age from 61~90 and
 * their spouse form a family;
 */
public class Family {

    private ArrayList<Person> familyMembers;
    private int familyID;
    private static int count = 0;

    public ArrayList<Person> getFamilyMembers() {
        return familyMembers;
    }

    public Family() {
        familyMembers = new ArrayList<Person>();
        count++;
        familyID = count;
    }

    public int getFamilyID() {
        return familyID;
    }

    public void setFamilyID(int familyID) {
        this.familyID = familyID;
    }

    public Person addFamilyMember(Person p) {
//        Person p = new Person();
        familyMembers.add(p);
        return p;
    }
    
//    public double getAvgBP() {
//        double score = 0;
//        int count = 0;
//        for (Person p : familyMembers) {
//            if (p.getAge() >= 30) {
//                count++;
//                score += p.getPatient().getAvgBP();
//            }
//        }
//        score = score / count;
//        return score;
//    }

    public double getAvgScore() {
        double score = 0;
        int count = 0;
        for (Person p : familyMembers) {
            if (p.getAge() >= 30) {
                count++;
                score += p.getPatient().getScore(p);
            }
        }
        score = score / count;
        return score;
    }

    public double getAvgRisk() {
        double risk = 0;
        int count = 0;
        for (Person p : familyMembers) {
            if (p.getAge() >= 30) {
                count++;
                risk += p.getPatient().getRisk(p);
            }
        }
        risk = risk / count;
        return risk;
    }

    public int getHighRiskNum() {
        int count = 0;
        for (Person p : familyMembers) {
            if (p.isHighRisk()) {
                count++;
            }
        }
        return count;
    }
}
