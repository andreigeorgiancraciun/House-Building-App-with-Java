package com.example.welcome;

public class HouseDimension {

    private final double minimum;
    private final double maximum;

    private double current;

    public HouseDimension(double minimum, double maximum) {
        this.minimum = minimum;
        this.maximum = maximum;

        // set current to minimum
        current = minimum;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        if (current > maximum) {
            // in case above max, set it to max
            current = maximum;
        }

        if (current < minimum) {
            // in case below min, set it to min
            current = minimum;
        }
        this.current = current;
    }
}
