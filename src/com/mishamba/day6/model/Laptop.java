package com.mishamba.day6.model;

import com.mishamba.day6.model.configuration.OS;

public class Laptop {
    private int batteryCapacity;
    private OS os;
    private int memoryRom;
    private int systemMemory;
    private float cpu;
    private int displayInches;

    public Laptop(int batteryCapacity, OS os, int memoryRom, int systemMemory, float cpu, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public OS getOs() {
        return os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public float getCpu() {
        return cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
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

        Laptop laptop = (Laptop) o;
        return getBatteryCapacity() == laptop.getBatteryCapacity() &&
                getMemoryRom() == laptop.getMemoryRom() &&
                getSystemMemory() == laptop.getSystemMemory() &&
                Float.compare(laptop.getCpu(), getCpu()) == 0 &&
                getDisplayInches() == laptop.getDisplayInches() &&
                getOs() == laptop.getOs();
    }

    @Override
    public int hashCode() {
        int hash;
        int prime = 43;

        hash = batteryCapacity * prime;
        hash += os.getNumber() * prime;
        hash += memoryRom * prime;
        hash += systemMemory * prime;
        hash += cpu * prime;
        hash += displayInches * prime;

        return hash;
    }
}
