/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pitchscheduling.pitchscheduler;

import java.util.Scanner;

/**
 *
 * @author User
 */


public class TextIndividualRequestInterface implements IndividualRequestInterface {

    @Override
    public void requestingID(String id) {
        System.out.println("Enter your ID");
        Scanner sn = new Scanner(System.in);
       id = sn.nextLine();
  
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean checkAvailability(boolean status) {

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String requestedTime(String requestedTime) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
