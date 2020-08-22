package com.mishamba.day1.model;

import com.mishamba.day1.model.configuration.FilterType;

public class VacuumCleaner extends Consumer {
    private FilterType filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(int powerConsumption, FilterType filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super.setPowerConsumption(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
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

        VacuumCleaner that = (VacuumCleaner) o;
        return getPowerConsumption() == that.getPowerConsumption() &&
                getMotorSpeedRegulation() == that.getMotorSpeedRegulation() &&
                getCleaningWidth() == that.getCleaningWidth() &&
                getFilterType() == that.getFilterType() &&
                getBagType().equals(that.getBagType()) &&
                getWandType().equals(that.getWandType());
    }

    @Override
    public int hashCode() {
        int hash;
        int prime = 38;

        hash = (getPowerConsumption() * prime) + getPowerConsumption();
        hash *= (filterType.getNumber() * prime) + filterType.getNumber();
        hash *= (bagType.hashCode() * prime) + bagType.hashCode();
        hash *= (wandType.hashCode() * prime) + wandType.hashCode();
        hash *= (motorSpeedRegulation * prime) + motorSpeedRegulation;
        hash *= (cleaningWidth * prime) + cleaningWidth;

        return hash;
    }
}
