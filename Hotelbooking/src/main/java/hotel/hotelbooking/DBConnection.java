/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package hotel.hotelbooking;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALAKSA
 */
public class DBConnection {
  public static Connection getConnection() {

    Connection conn = null;
    try {
        String url = "jdbc:sqlserver://skoot:1433;"
                   + "databaseName=hotel_db;"
                   + "user=sa;"
                   + "password=123;"
                   + "encrypt=false;"
                   + "trustServerCertificate=true;";
        
        conn = DriverManager.getConnection(url);
        System.out.println("✅ Connected Successfully!");
        
    } catch (Exception e) {
        System.out.println("❌ Connection Failed!");
        System.out.println(e.getMessage());
    }
    return conn;    
        
        
        
        
        
    }
      
      
      
      
      
      
      

}
