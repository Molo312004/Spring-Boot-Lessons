package com.molier.html_java.model;


public class User {
    private String fname;
    private String lname;
    private String email;

    public void setFname(String fname){
        this.fname = fname;
    }
    public String getFname(){
        return fname;
    }
    public void setLname(String lname){
        this.lname = lname;
    }
    public String getLname(){
        return lname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public String show(){
        String userInput = "First Name: " + fname + ", LastName: " + lname + ", Email: " + email;
        return userInput;
    }

}
