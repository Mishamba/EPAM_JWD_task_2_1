package com.mishamba.day1.model;


public class Speakers extends Consumer {
    private int numberOfSpeakers;
    private int frequencyRange;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers, int frequencyRange, int cordLength) {
        super(powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
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

        hash = (getPowerConsumption() * prime) + getPowerConsumption();
        hash *= (numberOfSpeakers * prime) + numberOfSpeakers;
        hash *= (frequencyRange * prime) + frequencyRange;
        hash *= (cordLength * prime) + cordLength;

        return hash;
    }
}
