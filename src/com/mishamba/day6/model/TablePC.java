package com.mishamba.day6.model;

import com.mishamba.day6.model.configuration.TablePCColor;

public class TablePC extends Entity {
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private TablePCColor color;

    public TablePC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, TablePCColor color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public TablePCColor getColor() {
        return color;
    }

    public void setColor(TablePCColor color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (this.getClass() == o.getClass()) {
            return false;
        }

        TablePC tablePC = (TablePC) o;
        return getBatteryCapacity() == tablePC.getBatteryCapacity() &&
                getDisplayInches() == tablePC.getDisplayInches() &&
                getMemoryRom() == tablePC.getMemoryRom() &&
                getFlashMemoryCapacity() == tablePC.getFlashMemoryCapacity() &&
                getColor() == tablePC.getColor();
    }

    @Override
    public int hashCode() {
        int hash;
        int prime = 36;

        hash = (batteryCapacity * prime) + batteryCapacity;
        hash *= (displayInches * prime) + displayInches;
        hash *= (memoryRom * prime) + memoryRom;
        hash *= (flashMemoryCapacity * prime) + flashMemoryCapacity;
        hash *= (color.getNumber() * prime) + color.getNumber();

        return hash;
    }
}
