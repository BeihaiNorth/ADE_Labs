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
public class Community {

    private ArrayList<House> community;
    private int communityID;
    private static int count = 0;

    public Community() {
        community = new ArrayList<House>();
        count++;
        communityID = count;

    }

    public int getCommunityID() {
        return communityID;
    }

    public ArrayList<House> getCommunity() {
        return community;
    }

    public House addHouse(House h) {
//        House h = new House();
        community.add(h);
        return h;
    }

    public double getAvgScore() {
        double score = 0;
        int count = 0;
        for (House h : community) {
            for (Family f : h.getHouse()) {
                for (Person p : f.getFamilyMembers()) {
                    if (p.getAge() >= 30) {
                        count++;
                        score += p.getPatient().getScore(p);
                    }
                }
            }
        }
        score = score / count;
        return score;
    }

    public double getAvgRisk() {
        double risk = 0;
        int count = 0;
        for (House h : community) {
            for (Family f : h.getHouse()) {
                for (Person p : f.getFamilyMembers()) {
                    if (p.getAge() >= 30) {
                        count++;
                        risk += p.getPatient().getRisk(p);
                    }
                }
            }
        }
        risk = risk / count;
        return risk;
    }

    public int getHighRiskNum() {
        int count = 0;
        for (House h : community) {
            for (Family f : h.getHouse()) {
                for (Person p : f.getFamilyMembers()) {
                    if (p.isHighRisk()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
