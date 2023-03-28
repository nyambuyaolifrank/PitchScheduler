/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pitchscheduling.pitchscheduler;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class student {
public static String name;
public static String surname;
public static String studentid;
public static String house;

public student(String name, String surname,String studentid, String house){
this.name = name;
this.surname = surname;
this.studentid = studentid;
this.house = house;
}

public String getName(){
return name;
}

public String getSurname(){
return surname;
}

public String getStudentId(){
return studentid;
}

public String getHouse(){
return house;
}

public static void Display(){
    Scanner scanner = new Scanner(System.in);
System.out.println("Enter Name");
name = scanner.nextLine();

System.out.println("Enter Surname");
surname = scanner.nextLine();

System.out.println("Enter StudentID");
studentid = scanner.nextLine();

System.out.println("Enter House");
house = scanner.nextLine();
}

}
