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
 * Family Directory include all the families in the community.
 * 
 */
public class FamilyDirectory {
    private ArrayList<Family> familyDirectory;
    
    public FamilyDirectory(){
        familyDirectory = new ArrayList<Family>();
    }

    public ArrayList<Family> getFamilyDirectory() {
        return familyDirectory;
    }
    
    public Family addFamily(){
        Family f = new Family();
        familyDirectory.add(f);
        return f;
    }
}
