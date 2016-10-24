/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Timestamp;

/**
 *
 * @author mwhai_000
 */
public class VitalSigns {
    
    private double bloodPressure;
    private double totalCholesterol;
    private double HDLCholesterol;
    private Timestamp timeStamp;

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTotalCholesterol() {
        return totalCholesterol;
    }

    public void setTotalCholesterol(double totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public double getHDLCholesterol() {
        return HDLCholesterol;
    }

    public void setHDLCholesterol(double HDLCholesterol) {
        this.HDLCholesterol = HDLCholesterol;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }


    
    
}
