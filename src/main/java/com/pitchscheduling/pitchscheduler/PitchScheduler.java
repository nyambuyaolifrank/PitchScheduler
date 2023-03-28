/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pitchscheduling.pitchscheduler;

import java.util.ArrayList;
import com.pitchscheduling.pitchscheduler.student;
import static com.pitchscheduling.pitchscheduler.student.house;
import static com.pitchscheduling.pitchscheduler.student.name;
import static com.pitchscheduling.pitchscheduler.student.studentid;
import static com.pitchscheduling.pitchscheduler.student.surname;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class PitchScheduler {

    //Athelete Inheriting from the clas Student
    public static class Athelete extends student{
    
        public Athelete(String name, String surname, String studentid, String house) {
            super(name, surname, studentid, house);
        }
        
        
    }
    
    //Soccer Player Inherinting from Student(Inheritance)
    public static class Player extends student{
    
        public Player(String name, String surname, String studentid, String house) {
            super(name, surname, studentid, house);
        }
    
    }
    
    //save to excel
    
    
    
    public static void main(String[] args) {
        
        //Display records of athelete and player
        Athelete.Display();
        Player.Display();
        
        

      
    }
}
