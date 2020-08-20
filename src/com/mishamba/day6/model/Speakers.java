package com.mishamba.day6.model;


public class Speakers extends Entity {
    private int powerConsumption;
    private int numberOfSpeakers;
    private int frequencyRange;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers, int frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(int frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
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

        Speakers speakers = (Speakers) o;
        return getPowerConsumption() == speakers.getPowerConsumption() &&
                getNumberOfSpeakers() == speakers.getNumberOfSpeakers() &&
                getFrequencyRange() == speakers.getFrequencyRange() &&
                getCordLength() == speakers.getCordLength();
    }

    @Override
    public int hashCode() {
        int hash;
        int prime = 53;

        hash = (powerConsumption * prime) + powerConsumption;
        hash *= (numberOfSpeakers * prime) + numberOfSpeakers;
        hash *= (frequencyRange * prime) + frequencyRange;
        hash *= (cordLength * prime) + cordLength;

        return hash;
    }
}
