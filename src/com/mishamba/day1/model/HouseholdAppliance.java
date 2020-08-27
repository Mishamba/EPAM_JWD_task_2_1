package com.mishamba.day1.model;

public abstract class HouseholdAppliance extends Consumer {
    private double height;
    private int weight;
    private double width;

    public HouseholdAppliance(double height, int weight, double width,
                              int powerConsumption) {
        super(powerConsumption);
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

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
