
package bankaccountapp;

/**
 *
 * @author HaiAu
 */
public class Checking extends Account {
    //list properties specific to the checking account
    private int debitCardNumber;
    private int debitCardPin;
    
    //Constructo to initialize checking account propertie
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;    
        setDebitCard();
    }
    
    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }
    
    //list any method specific to the checking account
    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }
    
    @Override
    public void showInfo(){        
        System.out.println("Account type: Checking.");
        super.showInfo();
        System.out.println("Your Checking Account Feature: " +
                "\nDebit Card Number: " + this.debitCardNumber +
                "\nDebit Card Pin: " + this.debitCardPin);
    }

    
    
}
