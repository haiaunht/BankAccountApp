
package bankaccountapp;

/**
 *
 * @author HaiAu
 */
public class Saving extends Account{
    //list properties specific to the Saving Account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    //Constructor to initialize setttings for the Saving properties
    public Saving(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;    //1 for saving, call acctN from superclass
        setSafetyDepositBox();
    }
    
    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }
    
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }
    
    
    //list any methods
    @Override
    public void showInfo(){
        System.out.println("Account type: Saving.");
        super.showInfo();  
        System.out.println("Your saving account feature: " + 
                "\nSafety Deposit Box ID: " + safetyDepositBoxID + 
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey);
    }

   
}
