package com.mishamba.day1.model;

public abstract class Consumer extends Appliance {
    private int powerConsumption;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
