package com.company;

public class Car {
    private int id;
    private String carsNum;

    public Car(int id, String carsNum) {
        this.id = id;
        this.carsNum = carsNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarsNum() {
        return carsNum;
    }

    public void setCarsNum(String carsNum) {
        this.carsNum = carsNum;
    }

    @Override
    public String toString() {
        return "id: " + id + ", " +
                "carsNum: " + carsNum +", ";
    }
}
