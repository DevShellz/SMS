/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;

/**
 *
 * @author cybschuma
 */
public class Employee extends Person {
    
    private String password;
    private String wing;
    private int accessLevel;
    private String username;
    
    
    
    public void setUser (String user, String pass, int access){
        username = user;
        password = pass;
        accessLevel = access;
    } 
    
    public void setWing (String wing){
        this.wing = wing;
    }
    
    public void changeAccess (int access){
        this.accessLevel = access;
    }
    
    
    
    
    
}
