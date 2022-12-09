/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WholeSaleManageMent;

import java.sql.*;

/**
 *
 * @author Pushpa
 */
public class Con {
    PreparedStatement ps;
    
    
    public static Connection Con(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/WholeSaleManagement?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Avengers@0864");
            return c;
        }
        catch(Exception e){
            System.out.println("Exception found"+ e);
        }
        return null;
    }
    
}
