package com.mishamba.day6.model;

public class Refrigerator {
    private int powerConsumption;
    private int weigth;
    private int freezerCapacity;
    private int overallCapacity;
    private int height;
    private int width;

    public Refrigerator(int powerConsumption, int weigth, int freezerCapacity, int overallCapacity, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weigth = weigth;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
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

        if (o.getClass() == this.getClass()) {
            return false;
        }

        Refrigerator that = (Refrigerator) o;
        return getPowerConsumption() == that.getPowerConsumption() &&
                getWeigth() == that.getWeigth() &&
                getFreezerCapacity() == that.getFreezerCapacity() &&
                getOverallCapacity() == that.getOverallCapacity() &&
                getHeight() == that.getHeight() &&
                getWidth() == that.getWidth();
    }

    @Override
    public int hashCode() {
        int hash;
        int prime = 53;

        hash = (prime * powerConsumption) + powerConsumption;
        hash *= (prime * weigth) + weigth;
        hash *= (prime * freezerCapacity) + freezerCapacity;
        hash *= (prime * overallCapacity) + overallCapacity;
        hash *= (prime * height) + height;
        hash *= (prime * width) + width;

        return hash;
    }
}
