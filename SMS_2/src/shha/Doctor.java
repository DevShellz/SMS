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
public class Doctor extends Employee{
    
    
    private String password;
    private String wing;
    private int accessLevel;
    private String username;
    
    private String speciality;
    private int salary;
    
    
    public void setSalary (int money){
        this.salary = money;
    }
    
    public void setSpeciality (String what){
        this.speciality = what;             //what does this man do
    }
    
    
}
