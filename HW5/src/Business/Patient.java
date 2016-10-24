/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mwhai_000
 */
public class Patient {

    private boolean Smoker;
    private boolean Diabetes;
    private Person person;

    private ArrayList<VitalSigns> vitalSignsList;

    public Patient() {
        vitalSignsList = new ArrayList<VitalSigns>();
    }

    
    
    public boolean isSmoker() {
        return Smoker;
    }

    public void setSmoker(boolean Smoker) {
        this.Smoker = Smoker;
    }

    public boolean isDiabetes() {
        return Diabetes;
    }

    public void setDiabetes(boolean Diabetes) {
        this.Diabetes = Diabetes;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<VitalSigns> getVitalSignsList() {
        return vitalSignsList;
    }

    public void setVitalSignsList(ArrayList<VitalSigns> vitalSignsList) {
        this.vitalSignsList = vitalSignsList;
    }

    public VitalSigns addVitalSigns(double bloodPressure, double totalCholesterol, double HDLCholesterol, Timestamp timeStamp) {
        VitalSigns vs = new VitalSigns();
        vs.setBloodPressure(bloodPressure);
        vs.setTotalCholesterol(totalCholesterol);
        vs.setHDLCholesterol(HDLCholesterol);
        vs.setTimeStamp(timeStamp);
        vitalSignsList.add(vs);
        return vs;
    }

    public double getAvgBP() {
        double bp = 0;
        for (VitalSigns vs : vitalSignsList) {
            bp += vs.getBloodPressure();
        }
        bp = bp / vitalSignsList.size();
        return bp;
    }

    public double getAvgTotalCholesterol() {
        double totalCHL = 0;
        for (VitalSigns vs : vitalSignsList) {
            totalCHL += vs.getTotalCholesterol();
        }
        totalCHL = totalCHL / vitalSignsList.size();
        return totalCHL;
    }

    public double getAvgHDLCholesterol() {
        double HDLCHL = 0;
        for (VitalSigns vs : vitalSignsList) {
            HDLCHL += vs.getHDLCholesterol();
        }
        HDLCHL = HDLCHL / vitalSignsList.size();
        return HDLCHL;
    }

    public int getScore(Person person) {
        int score = 0;

        if (isSmoker()) {
            score += 4;
        }

        int age = person.getAge();
        double totalC = getAvgTotalCholesterol();
        double HDLC = getAvgHDLCholesterol();
        double BP = getAvgBP();

        if (person.isIsMale()) {

            if (isDiabetes()) {
                score += 2;
            }

            //age
            if (age <= 34) {
                score -= 1;
            } else if (age <= 39) {
                score -= 0;
            } else if (age <= 44) {
                score += 1;
            } else if (age <= 49) {
                score += 2;
            } else if (age <= 54) {
                score += 3;
            } else if (age <= 59) {
                score += 4;
            } else if (age <= 64) {
                score += 5;
            } else if (age <= 69) {
                score += 6;
            } else {
                score += 7;
            }

            //total Cholesterol(mmol/L)
            if (totalC < 4.14) {
                score -= 3;
            } else if (totalC < 5.17) {
                score += 0;
            } else if (totalC < 6.21) {
                score += 1;
            } else if (totalC < 7.24) {
                score += 2;
            } else {
                score += 3;
            }

            //HDL Cholesterol(mmol/L)
            if (HDLC < 0.90) {
                score += 2;
            } else if (HDLC < 1.16) {
                score += 1;
            } else if (HDLC < 1.29) {
                score += 0;
            } else if (HDLC < 1.55) {
                score += 0;
            } else {
                score -= 2;
            }

            //Blood Pressure(Systolic)(mm Hg)
            if (BP <= 129) {
                score += 0;
            } else if (BP <= 139) {
                score += 1;
            } else if (BP <= 159) {
                score += 2;
            } else {
                score += 3;
            }

        } else {

            if (isDiabetes()) {
                score += 4;
            }

            //age
            if (age <= 34) {
                score -= 9;
            } else if (age <= 39) {
                score -= 4;
            } else if (age <= 44) {
                score -= 0;
            } else if (age <= 49) {
                score += 3;
            } else if (age <= 54) {
                score += 6;
            } else if (age <= 59) {
                score += 7;
            } else {
                score += 8;
            }

            //total Cholesterol(mmol/L)
            if (totalC < 4.14) {
                score -= 2;
            } else if (totalC < 5.17) {
                score += 0;
            } else if (totalC < 6.21) {
                score += 1;
            } else if (totalC < 7.24) {
                score += 1;
            } else {
                score += 3;
            }

            //HDL Cholesterol(mmol/L)
            if (HDLC < 0.90) {
                score += 5;
            } else if (HDLC < 1.16) {
                score += 2;
            } else if (HDLC < 1.29) {
                score += 1;
            } else if (HDLC < 1.55) {
                score += 0;
            } else {
                score -= 3;
            }

            //Blood Pressure(Systolic)(mm Hg)
            if (BP < 120) {
                score -= 3;
            } else if (BP <= 139) {
                score += 0;
            } else if (BP <= 159) {
                score += 2;
            } else {
                score += 3;
            }

        }
        return score;
    }

    public double getRisk(Person person) {
        int risk = 0;
        int score = getScore(person);
        if (person.isIsMale()) {
            if (score <= -1) {
                risk = 2;
            } else if (score == 0) {
                risk = 3;
            } else if (score == 1 || score == 2) {
                risk = 4;
            } else if (score == 3) {
                risk = 6;
            } else if (score == 4) {
                risk = 9;
            } else if (score == 5) {
                risk = 9;
            } else if (score == 6) {
                risk = 11;
            } else if (score == 7) {
                risk = 14;
            } else if (score == 8) {
                risk = 18;
            } else if (score == 9) {
                risk = 22;
            } else if (score == 10) {
                risk = 27;
            } else if (score == 11) {
                risk = 33;
            } else if (score == 12) {
                risk = 40;
            } else if (score == 13) {
                risk = 47;
            } else {
                risk = 56;
            }
        }else{
            if (score <= -2) {
                risk = 1;
            } else if (score == -1||score == 0 || score == 1) {
                risk = 2;
            } else if (score == 2||score == 3) {
                risk = 3;
            } else if (score <=9) {
                risk = score;
            } else if (score == 10) {
                risk = 11;
            } else if (score == 11) {
                risk = 13;
            } else if (score == 12) {
                risk = 15;
            } else if (score == 13) {
                risk = 17;
            } else if (score == 14) {
                risk = 20;
            } else if (score == 15) {
                risk = 24;
            } else if (score == 16) {
                risk = 27;
            }  else {
                risk = 32;
            }
        }
        return risk;
    }
    
}
