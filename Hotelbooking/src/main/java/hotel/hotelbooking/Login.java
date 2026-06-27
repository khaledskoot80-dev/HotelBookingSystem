/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.hotelbooking;

/**
 *
 * @author ALAKSA
 */
public class Login {
  private String username;
    private String password;

    public Login(String username,
                 String password) {

        this.username = username;
        this.password = password;
    }

    public boolean authenticate() {

        return username.equals("admin")
                && password.equals("1234");
    }   
}
