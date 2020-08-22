package com.mishamba.day1.model;

public abstract class HouseholdAppliance extends Consumer {
    private int weight;
    private double width;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
