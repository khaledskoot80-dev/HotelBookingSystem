/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.hotel;

/**
 *
 * @author ALAKSA
 */
public class Booking {
private Customer customer;
private Room room;
private int day;

    public Booking() {
    }

    public Booking(Customer customer, Room room, int day) {
        this.customer = customer;
        this.room = room;
        this.day = day;
    }
public void confirbooking()
{
if(room.isAvailable()){
    room.setAvailable(false);
        System.out.println("BOOKING FOR CONFIRMED   "+customer.getName());
}
else
        System.out.println("ROOM NOT AVAILABLE");
}
public double calculate_total()
{
return room.getPrice_room()*day;
}
}
