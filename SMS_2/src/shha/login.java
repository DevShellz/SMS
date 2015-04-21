/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;




public class login {

    Connection con;
    Statement st;
    ResultSet rs;
    
    
    public login(){
        
        connect();
        frame();
        
        
    }
    
    public void connect(){
        
        
        try
        {
            
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        Class.forName(driver);
        String db = "jdbc:derby:SMSDB2";
        con = DriverManager.getConnection(db);
        st = con.createStatement();
        
        
        }
        catch(Exception ex){
            
        }
    }
    public void frame(){
        
        
        
    }
}
