package com.mishamba.day6.model;

public class Oven {
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private int height;
    private double width;

    public Oven(int powerConsumption, int weight, int capacity, int depth, int height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }

        Oven oven = (Oven) o;
        return getPowerConsumption() == oven.getPowerConsumption() &&
                getWeight() == oven.getWeight() &&
                getCapacity() == oven.getCapacity() &&
                getDepth() == oven.getDepth() &&
                getHeight() == oven.getHeight() &&
                Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        int hash;
        int prime = 32;
        hash = prime * powerConsumption;
        hash *= prime * weight;
        hash *= prime * capacity;
        hash *= prime * depth;
        hash *= prime * height;
        hash *= prime * width;

        return hash;
    }
}
