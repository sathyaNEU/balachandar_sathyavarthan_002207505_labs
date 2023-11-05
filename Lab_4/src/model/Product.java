/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    ImageIcon logoImage;

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    ArrayList<Feature> featureList;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        featureList = new ArrayList<>();
        
    }

    public ArrayList<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(ArrayList<Feature> featureList) {
        this.featureList = featureList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void removeFeature(String name){
        Feature local_feature=null;
        for(Feature feature : this.featureList){
            if(feature.getName().equals(name))
                local_feature = feature;
        }
        if(local_feature!=null)
            this.featureList.remove(local_feature);
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
