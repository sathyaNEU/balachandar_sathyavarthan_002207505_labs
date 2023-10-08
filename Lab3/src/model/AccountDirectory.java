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
public class AccountDirectory {
    ArrayList<Account> accountDirectory;

    public AccountDirectory() {
        this.accountDirectory = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountDirectory() {
        return accountDirectory;
    }

    public Account addAcctToAccDirectory() {
        Account account = new Account();
        this.accountDirectory.add(account);
        return account;
    }
    
    public void deleteAccFromAccDirectory(Account acc){
        this.accountDirectory.remove(acc);
    }
    
    public Account searchAccFromAccountDirectory(String accno){
        for(Account acc : this.accountDirectory)
            if(acc.getAccNum().equals(accno))
                return acc;
        return null;
        
    }
    
    
    
}
