package analytics;

import java.util.Comparator;
import java.util.HashMap;
import model.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sathya
 */
public class UserMapComparator implements Comparator<User>{

    HashMap<Integer, Integer> userPostnum;
    UserMapComparator(HashMap<Integer, Integer> userPostNum) {
        this.userPostnum = userPostNum;
    }

    @Override
    public int compare(User o1, User o2) {
        
       return Integer.compare(
               ((this.userPostnum.get(o1.getId())==null)?0:this.userPostnum.get(o1.getId())),
               ((this.userPostnum.get(o1.getId())==null)?0:this.userPostnum.get(o1.getId()))
       );
    }

    
}
