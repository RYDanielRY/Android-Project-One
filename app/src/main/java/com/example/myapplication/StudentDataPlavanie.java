package com.example.myapplication;

public class StudentDataPlavanie
{
    private String firstName;
    private String lastName;
    private String NumberCourse;

    public static final StudentDataPlavanie[] drinks = {
            new StudentDataPlavanie("Иван", "Иванов", "4"),
            new StudentDataPlavanie("Мария", "Иванова", "4"),
            new StudentDataPlavanie("Анастасия", "Александровна", "3")
    };
    //Each Drink has a name, description, and an image resource
    private StudentDataPlavanie (String firstName, String lastName, String NumberCourse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.NumberCourse = NumberCourse;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getNumberCourse() {
        return lastName;
    }
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
