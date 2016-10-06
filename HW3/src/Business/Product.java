/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author leslie
 */
public class Product {
    
    private String name;
    private String modelNum;
    private String vendor;
    private String underCatalog;
    private String description;
    private float basePrice;
    private float ceilingPrice;
    private float floorPrice;
    private ArrayList<String> features;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getUnderCatalog() {
        return underCatalog;
    }

    public void setUnderCatalog(String underCatalog) {
        this.underCatalog = underCatalog;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(float ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public float getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(float floorPrice) {
        this.floorPrice = floorPrice;
    }

    public ArrayList<String> getFeatures() {
        return features;
    }

    public void setFeatures(String featuresString) {
        String[] featureStrArray = featuresString.split(",");
        this.features = new ArrayList<String>(Arrays.asList(featureStrArray));
    }

    @Override
    public String toString(){
        return name;
    }
    
    
}
