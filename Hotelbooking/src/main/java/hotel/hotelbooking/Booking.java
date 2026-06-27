/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.hotelbooking;
// 
/**
 *
 * @author ALAKSA
 */
public class Booking implements Bookable {
 private Customer customer;
    private Room room;

    public Booking(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
    }

    @Override
    public void bookRoom() {

        if(room.isAvailable()) {
            room.setAvailable(false);
            System.out.println("Booking Successful");
        }
    }

    @Override
    public void cancelBooking() {
        room.setAvailable(true);
        System.out.println("Booking Cancelled");
    }   
}
