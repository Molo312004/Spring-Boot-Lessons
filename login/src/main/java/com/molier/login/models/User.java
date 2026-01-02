package com.molier.login.models;

//This is my User model class to represent a user in the system
public class User {
    private String fname;
    private String lname;
    private String mail;
    private String password;

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

    public void setMail(String mail){
        this.mail = mail;
    }
    public String getMail(){
        return mail;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
    public String show(){
        return fname + " " + lname + " " + mail + " " + password;
    }
}
