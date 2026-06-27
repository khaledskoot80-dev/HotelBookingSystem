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
public  abstract class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayInfo();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    
    }    
}
