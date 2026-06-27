/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.hotelbooking;
//CLASS
/**
 *
 * @author ALAKSA
 */
public class Customer extends Person {
     public Customer(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer: " + getName());
    }
}
