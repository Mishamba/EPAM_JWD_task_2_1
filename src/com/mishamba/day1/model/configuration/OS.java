package com.mishamba.day1.model.configuration;

public enum OS {
    Linux(1),
    Windows(2);

    private int number;

    OS(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
