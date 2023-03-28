/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pitchscheduling.pitchscheduler;

/**
 *
 * @author User
 */
public interface IndividualRequestInterface {
    void requestingID(String id);
    boolean checkAvailability(boolean status);
    String requestedTime(String requestedTime);
}
