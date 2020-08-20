package com.mishamba.day1.model;

public class Computer extends Entity {
    private int batteryCapacity;
    private int memoryRom;
    private int displayInches;

    public Computer(int displayInches, int memoryRom, int batteryCapacity) {
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }
}
