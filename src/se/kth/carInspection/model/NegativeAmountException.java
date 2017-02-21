/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;
/**
 *
 * @author Ayham
 */
public class NegativeAmountException extends Exception{
    
    int amount;
    
    NegativeAmountException(int amount) {
       this.amount=amount;
    }
    public String toString(){ 
       return ("Negative money Exception in the following amount: " +amount) ;
    }
}