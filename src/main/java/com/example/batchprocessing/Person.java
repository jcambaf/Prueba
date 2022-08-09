package com.example.batchprocessing;

public class Person {

    private String lastName;
    private String firstName;
    private int edad;

    private String direccion;

    public Person() {}

    public Person(String firstName, String lastName, int edad, String direccion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.edad = edad;
        this.dirección = direccion;
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