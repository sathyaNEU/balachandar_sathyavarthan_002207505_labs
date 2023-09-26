/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Sathya
 */
public class VitalsHistory {
    
    ArrayList<Vitals> arrayVitals;

    public VitalsHistory() {
        arrayVitals =  new ArrayList<Vitals>();
    }

    public ArrayList<Vitals> getArrayVitals() {
        return arrayVitals;
    }

    public void setArrayVitals(ArrayList<Vitals> arrayVitals) {
        this.arrayVitals = arrayVitals;
    }
    
    public Vitals addVitalsToVitalsArrayObject(){
        Vitals vitals = new Vitals();
        this.arrayVitals.add(vitals);
        return vitals;
    }
    
    public void deleteVitalsFromVitalsObject(Vitals vitals){
        this.arrayVitals.remove(vitals);
    }
    
    
    
}
