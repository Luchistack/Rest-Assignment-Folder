package main.hotel.management.system.data.Models;

import javax.management.relation.Role;

public class Staff {
    private String staffId;
    private String firstName;
    private String lastName;
    private Role role;
    private String email;
    private String phoneNumber;
    private double salary;


    public Staff(String staffId, String firstName, String lastName, Role role, String email, String phoneNumber, double salary){
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getStaffId(){
        return staffId;
    }
    public void setStaffId(String staffId){
        this.staffId = staffId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role){
        this.role = role;
    }
    public String getEmail(){
        return email;
     }
     public void setEmail(String email){
        this.email = email;
     }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    private double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//
//    public int count() {
//    }
}



