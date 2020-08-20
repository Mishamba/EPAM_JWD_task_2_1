package com.mishamba.day6.model.configuration;

public enum TablePCColor {
    BLUE(1),
    RED(2),
    GREEN(3);

    private int number;

    private TablePCColor(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
