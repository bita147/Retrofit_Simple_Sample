package com.example.abc.retrofitdemo.model;

import java.io.Serializable;

public class SimpleJsonObject implements Serializable {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String gender;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getGender() {
        return gender;
    }

    public String get(String paramName) {
        return null;
    }

    public String set(String paramName) {
        return pramName;
    }
}
