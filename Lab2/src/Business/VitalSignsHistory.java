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
public class VitalSignsHistory {
    
    private ArrayList<VitalSigns> vitalSignsHistory;
    
    public VitalSignsHistory(){                             //Constructor
        vitalSignsHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignsHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        vitalSignsHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v){
        vitalSignsHistory.remove(v);
    }
}
