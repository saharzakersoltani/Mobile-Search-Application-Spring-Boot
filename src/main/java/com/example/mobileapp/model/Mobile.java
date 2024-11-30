package com.example.mobileapp.model;

public class Mobile {
    private String brand;
    private String color;
    private int storage;

    public Mobile(String brand, String color, int storage) {
        this.brand = brand;
        this.color = color;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
