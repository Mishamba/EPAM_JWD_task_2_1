package com.mishamba.day1.model.configuration;

import com.mishamba.day1.model.exception.ModelException;
import org.jetbrains.annotations.NotNull;

public class FrequencyRange {
    private double leftBorder;
    private double rightBorder;

    public FrequencyRange(double leftBorder, double rightBorder) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
    }

    public static class FrequencyRangeFactory {
        private static final String SEPARATOR = "-";

        public static @NotNull FrequencyRange createRange
                (@NotNull String string) throws ModelException {
            String[] numbers = string.split(SEPARATOR);
            double leftBorder;
            double rightBorder;
            try {
                leftBorder = Double.parseDouble(numbers[0]);
                rightBorder = Double.parseDouble(numbers[1]);
            } catch (NumberFormatException exception) {
                throw new ModelException(exception);
            }

            return new FrequencyRange(leftBorder, rightBorder);
        }
    }

    public double getLeftBorder() {
        return leftBorder;
    }

    public void setLeftBorder(double leftBorder) {
        this.leftBorder = leftBorder;
    }

    public double getRightBorder() {
        return rightBorder;
    }

    public void setRightBorder(double rightBorder) {
        this.rightBorder = rightBorder;
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

        FrequencyRange that = (FrequencyRange) o;
        return Double.compare(that.getLeftBorder(), getLeftBorder()) == 0 &&
                Double.compare(that.getRightBorder(), getRightBorder()) == 0;
    }

    @Override
    public int hashCode() {
        int prime = 35;
        double hash = leftBorder * prime;
        hash *= rightBorder * prime;
        return Math.getExponent(hash);
    }
}
