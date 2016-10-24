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
 */
public class House {

    private ArrayList<Family> house;
    private int houseID;
    private static int count = 0;

    public House() {
        house = new ArrayList<Family>();
        count++;
        houseID = count;
    }

    public int getHouseID() {
        return houseID;
    }

    public ArrayList<Family> getHouse() {
        return house;
    }

    public Family addFamily(Family f) {
//        Family f = new Family();
        house.add(f);
        return f;
    }

    public double getAvgScore() {
        double score = 0;
        int count = 0;
        for (Family f : house) {
            for (Person p : f.getFamilyMembers()) {
                if (p.getAge() >= 30) {
                    count++;
                    score += p.getPatient().getScore(p);
                }
            }
        }
        score = score / count;
        return score;
    }

    public double getAvgRisk() {
        double risk = 0;
        int count = 0;
        for (Family f : house) {
            for (Person p : f.getFamilyMembers()) {
                if (p.getAge() >= 30) {
                    count++;
                    risk += p.getPatient().getRisk(p);
                }
            }
        }
        risk = risk / count;
        return risk;
    }

    public int getHighRiskNum() {
        int count = 0;
        for (Family f : house) {
            for (Person p : f.getFamilyMembers()) {
                if (p.isHighRisk()) {
                    count++;
                }
            }
        }
        return count;
    }
}
