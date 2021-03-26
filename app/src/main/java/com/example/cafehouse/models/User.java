package com.example.cafehouse.models;

public class User {
    String profilePicture , userName , mail , password,  phoneNumber;

    public User(String profilePicture, String userName, String mail, String password, String phoneNumber) {
        this.profilePicture = profilePicture;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(){}

    //signUp constructor
    public User(String userName, String mail, String password, String phoneNumber) {
        this.profilePicture = profilePicture;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }




    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
