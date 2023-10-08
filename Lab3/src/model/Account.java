/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;

/**
 *
 * @author Sathya
 */
public class Account {
    
    private String accNum;
    private String routingNum;
    private String bankName;
    private Float balance;
    private Date DateOfOpening;
    
    public Account(){
        this.DateOfOpening = new Date();
    }

    public String getAccNum() {
        return accNum;
    }

    public Date getDateOfOpening() {
        return DateOfOpening;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getRoutingNum() {
        return routingNum;
    }

    public void setRoutingNum(String routingNum) {
        this.routingNum = routingNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString(){
        return this.accNum;
    }
   
}
