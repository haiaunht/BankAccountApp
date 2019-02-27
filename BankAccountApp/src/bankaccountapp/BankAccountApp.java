/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HaiAu
 */
public class BankAccountApp {

    public static void main(String[] args) {
        try {
            String file = "mississippi.txt";
            Checking chk1 = new Checking("Hai-Au Bui", "123456789", 1500);
            Saving sav1 = new Saving("Toan Nguyen", "3456343433", 2500);
            chk1.showInfo();
            System.out.println("*************************");
            
            sav1.showInfo();
            sav1.deposit(1000);
            sav1.withdraw(500);
            sav1.transfer("Toan", 200);
            sav1.compound();
            
//            // read a CSV file then create new accounts based on that data
//            List<String[]> newAccountHolders = bankaccountapp.utilities.CSV.read(file);
//            for(String[] accountHolder : newAccountHolders){
//                System.out.println("NEW ACCOUNT");
//                System.out.println(accountHolder[0]);
//                System.out.println(accountHolder[1]);
//                System.out.println(accountHolder[2]);
//                System.out.println(accountHolder[3]);
//                        
//           }  
        } catch (Exception ex) {
            Logger.getLogger(BankAccountApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
