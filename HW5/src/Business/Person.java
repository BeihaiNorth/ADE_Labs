/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author leslie
 *
 * Assumptions: 1. Everyone has siblings; 2. Age 0~30: no children, has parents
 * 3. Age 31~60: has children, has parents 4. Age 61~90: has children, no
 * parents
 *
 *
 */
public class Person {

    private String name;
    private int age;
    private boolean isMale;
    private Person father;
    private Person mother;
    private Person siblings;
    private Person child1;
    private Person child2;
    private Family family;

    private Patient patient;

    private int ID;
    private static int count = 0;

    public Person() {
        patient = new Patient();
        count++;
        ID = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getSiblings() {
        return siblings;
    }

    public void setSiblings(Person siblings) {
        this.siblings = siblings;
    }

    public Person getChild1() {
        return child1;
    }

    public void setChild1(Person child1) {
        this.child1 = child1;
    }

    public Person getChild2() {
        return child2;
    }

    public void setChild2(Person child2) {
        this.child2 = child2;
    }
    
    

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getID() {
        return ID;
    }

    public boolean isHighRisk() {
        boolean isHighRisk = false;
        if (getPatient().getRisk(this) > 13.5) {
            isHighRisk = true;
        }
        return isHighRisk;
    }
}
