package com.mishamba.day1.model;

import com.mishamba.day1.model.configuration.TablePCColor;

public class TabletPC extends Computer {
    private int flashMemoryCapacity;
    private TablePCColor color;

    public TabletPC(int batteryCapacity, int displayInches, int memoryRom,
                    int flashMemoryCapacity, TablePCColor color) {
        super(displayInches, memoryRom, batteryCapacity);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
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

        TabletPC tablePC = (TabletPC) o;
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

        hash = (super.getBatteryCapacity() * prime) +
                super.getBatteryCapacity();
        hash *= (super.getDisplayInches() * prime) + super.getDisplayInches();
        hash *= (super.getMemoryRom() * prime) + super.getMemoryRom();
        hash *= (flashMemoryCapacity * prime) + flashMemoryCapacity;
        hash *= (color.getNumber() * prime) + color.getNumber();

        return hash;
    }
}
