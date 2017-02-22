/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;

/**
 *
 * @author tmpuser-10215
 */
public class InvalidLicenseException extends Exception {
    private String licenseNumber;
   public InvalidLicenseException(String licenseNumber){
        this.licenseNumber=licenseNumber;
    }
    @Override
    public String toString (){
        return "this license "+licenseNumber+" has no inspections to do";
    }
}
