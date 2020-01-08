package com.denkiri.zalego.models;

public class Student {
    private int id;
    private String name,lastname, username, mobile,email, gender;

    public Student(int id,String name, String username,String lastname,String mobile, String email, String gender) {
        this.id = id;
        this.name=name;
        this.lastname=lastname;
        this.username = username;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }
    public String getName(){

        return name;
    }
    public String getLastName(){

        return lastname;
    }
    public String getUsername() {
        return username;
    }
    public String getMobile() {
        return mobile;
    }
    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

}


