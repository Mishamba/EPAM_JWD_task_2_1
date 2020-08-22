package com.mishamba.day1.model;

import com.mishamba.day1.model.configuration.OS;

public class Laptop extends Computer {
    private OS os;
    private int systemMemory;
    private float cpu;

    public Laptop(int batteryCapacity, OS os, int memoryRom, int systemMemory, float cpu, int displayInches) {
        super(displayInches, memoryRom, batteryCapacity);
        this.os = os;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
    }

    public OS getOs() {
        return os;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public float getCpu() {
        return cpu;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
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

        hash = super.getBatteryCapacity() * prime;
        hash += os.getNumber() * prime;
        hash += super.getMemoryRom() * prime;
        hash += systemMemory * prime;
        hash += cpu * prime;
        hash += super.getDisplayInches() * prime;

        return hash;
    }
}
