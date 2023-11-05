/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class GlobalFeatureList {
    ArrayList<Feature> globalFeatureList;
    
    public GlobalFeatureList(){
        globalFeatureList = new ArrayList<>();
    }
    
    public void addFeatureToGlobalFeatureList(String name){
        Feature feature = new Feature();
        feature.setName(name);
        feature.setDesc("");
        this.globalFeatureList.add(feature);
    }
    
    public ArrayList<Feature> getGlobalFeatureList(){
        return this.globalFeatureList;
    }
    
    public boolean searchFeatureFromGlobalFeatureList(String name){
        for(Feature feature : this.globalFeatureList){
            if(feature.getName().equals(name))
                return true;
        }
        return false;
    }
}
