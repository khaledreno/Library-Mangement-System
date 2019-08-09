/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khaled
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class connection {
    Connection connect;
    
public static Connection ConnectDB(){
        try {
            Class.forName("org.sqlite.JDBC");
           Connection connect = DriverManager.getConnection("jdbc:sqlite:A:\\NetBeansProjects\\Library Application\\src\\Database1.db");
           return connect;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"connection");
            return null;
        }
    }
    
    
}
