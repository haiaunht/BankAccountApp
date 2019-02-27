/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

/**
 *
 * @author HaiAu
 */
public abstract class Account implements IBaseRate {     //not create object form Account, just for Saving and Checking inherited
    //list common properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;
    
    private static int index = 10000;   //to make 5 digit unique 
    protected String accountNumber; //so checking and saving class can use
    protected double rate;  //so checking and saving class can use
    
    //Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        
        //set accound number
        index++;
        this.accountNumber = setAccountNumber();
        //call the setRate for checking or saving
        setRate();
    }
    
    public abstract void setRate();
    
    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    
    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }
    
    //list common methods - transaction
    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }
    
    public void withdraw(double amount){
        balance -= amount;        
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    
    public void transfer(String toWhere, double amount){
        balance -= amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }
    
    public void printBalance(){
        System.out.println("Your balance is now: $" + balance);
    }
    
    public void showInfo(){
      
        System.out.println("Name: " + name + "\nAccount number: " + accountNumber + 
                "\nBalance: " + balance + "\nRate: " + rate + "%");
    }
    
    
}
