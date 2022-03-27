package com.gostugo.wookbook.entities;
import java.time.LocalDate;

public class Address {
    public String firstName;
    public String lastName;
    private LocalDate startDate;

    public Address(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    public String name() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getStart() {
        return this.startDate;
    }
  
}
