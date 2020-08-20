package com.mishamba.day1.model;

public class Refrigerator extends PowerWeightWidth {
    private int freezerCapacity;
    private int overallCapacity;
    private int height;

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, int overallCapacity, int height, int width) {
        super.setPowerConsumption(powerConsumption);
        super.setWeight(weight);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        super.setWidth(width);
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
                super.getWeight() == that.getWeigth() &&
                getFreezerCapacity() == that.getFreezerCapacity() &&
                getOverallCapacity() == that.getOverallCapacity() &&
                getHeight() == that.getHeight() &&
                getWidth() == that.getWidth();
    }

    @Override
    public int hashCode() {
        int hash;
        int prime = 53;

        hash = (prime * getPowerConsumption()) + getPowerConsumption();
        hash *= (prime * getWeight()) + getWeight();
        hash *= (prime * freezerCapacity) + freezerCapacity;
        hash *= (prime * overallCapacity) + overallCapacity;
        hash *= (prime * height) + height;
        hash *= (prime * getWidth()) + getWidth();

        return hash;
    }
}
