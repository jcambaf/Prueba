package com.example.batchprocessing;

public class Person {

    private String lastName;
    private String firstName;
    private int edad;

    public Person() {}

    public Person(String firstName, String lastName, int edad) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.edad = edad;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }
}