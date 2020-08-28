package com.mishamba.day1.model;

public class Refrigerator extends HouseholdAppliance {
    private int freezerCapacity;
    private int overallCapacity;

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity,
                        int overallCapacity, int height, int width) {
        super(height, weight, width, powerConsumption);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
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
                super.getWeight() == that.getWeight() &&
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
        hash *= (prime * getHeight()) + getHeight();
        hash *= (prime * getWidth()) + getWidth();

        return hash;
    }
}
