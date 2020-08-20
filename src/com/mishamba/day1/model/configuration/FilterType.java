package com.mishamba.day1.model.configuration;

public enum FilterType {
    A(1),
    B(2),
    C(3);

    private int number;

    private FilterType (int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
