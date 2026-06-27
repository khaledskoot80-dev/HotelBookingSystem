/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.hotelbooking;
//class
/**
 *
 * @author ALAKSA
 */
public class Employee  extends Person {
    
 public Employee(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee: " + getName());
    }}