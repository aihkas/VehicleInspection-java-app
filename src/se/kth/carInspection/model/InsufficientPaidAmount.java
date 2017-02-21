package se.kth.carInspection.model;


import se.kth.carInspection.model.Amount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tmpuser-10215
 */
public class InsufficientPaidAmount extends Exception{
    private Amount amount;
    
    InsufficientPaidAmount(Amount amount){
        this.amount=amount;
        
        
    }
 
}
