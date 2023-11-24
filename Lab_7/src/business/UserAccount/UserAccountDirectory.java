/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        boolean isExist = validateUser(username, employee, role);
        if(isExist==false){
            UserAccount userAccount = new UserAccount();
            userAccount.setUsername(username);
            userAccount.setPassword(password);
            userAccount.setEmployee(employee);
            userAccount.setRole(role);
            userAccountList.add(userAccount);
            return userAccount;
        }
        else
            return null;
    }

    private boolean validateUser(String username, Employee employee, Role role) {
        for(UserAccount userAccount :  this.userAccountList)
            if(userAccount.getUsername().equals(username))
                return true;
        return false;
    }
}
