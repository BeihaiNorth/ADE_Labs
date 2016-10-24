/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class City {

    private String cityName;
    private CommunityDirectory communityList;

    public City(CommunityDirectory communityList) {
        this.communityList = communityList;
    }

    public CommunityDirectory getCommunityList() {
        return communityList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getAvgScore() {
        double score = 0;
        int count = 0;
        for (Community c : getCommunityList().getCommunityDirectory()) {
            for (House h : c.getCommunity()) {
                for (Family f : h.getHouse()) {
                    for (Person p : f.getFamilyMembers()) {
                        if (p.getAge() >= 30) {
                            count++;
                            score += p.getPatient().getScore(p);
                        }
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
        for (Community c : getCommunityList().getCommunityDirectory()) {
            for (House h : c.getCommunity()) {
                for (Family f : h.getHouse()) {
                    for (Person p : f.getFamilyMembers()) {
                        if (p.getAge() >= 30) {
                            count++;
                            risk += p.getPatient().getRisk(p);
                        }
                    }
                }
            }
        }
        risk = risk / count;
        return risk;
    }

    public int getHighRiskNum() {
        int count = 0;
        for (Community c : getCommunityList().getCommunityDirectory()) {
            for (House h : c.getCommunity()) {
                for (Family f : h.getHouse()) {
                    for (Person p : f.getFamilyMembers()) {
                        if (p.isHighRisk()) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
