package com.company;

public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private int year;

    public Human(String firstName, String lastName, String gender, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



}
