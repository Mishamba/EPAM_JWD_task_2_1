package com.mishamba.day1.model;

public class Oven extends HouseholdAppliance {
    private int capacity;
    private int depth;

    public Oven(int powerConsumption, int weight, int capacity, int depth,
                double height, double width) {
        super(height, weight, width ,powerConsumption);
        this.capacity = capacity;
        this.depth = depth;
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
        hash = prime * getPowerConsumption();
        hash *= prime * getWeight();
        hash *= prime * capacity;
        hash *= prime * depth;
        hash *= prime * getHeight();
        hash *= prime * getWidth();

        return hash;
    }
}
