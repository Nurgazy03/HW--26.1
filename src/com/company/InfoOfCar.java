package com.company;

import java.time.LocalDate;

public class InfoOfCar {
    private int yearOfIssue;
    private String model;
    private int price;
    private String colour;

    public InfoOfCar(int yearOfIssue, String model, int price, String colour) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "yearOfIssue: " + yearOfIssue + ", " +
                " model: " + model + ", " +
                " price: " + price + ", " +
                " colour: " + colour;
    }
}
