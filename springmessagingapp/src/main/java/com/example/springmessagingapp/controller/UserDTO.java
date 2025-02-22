package com.example.springmessagingapp.controller;

public class UserDTO {
    private String firstName;
    private String lastName;

    //getter and setters
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return this.lastName;

    }
}
