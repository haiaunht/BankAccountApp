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
public interface IBaseRate {
    //write a method that return the base rate
    default double getBaseRate(){
        return 2.5;
    }
}
