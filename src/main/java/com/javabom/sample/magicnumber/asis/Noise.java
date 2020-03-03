package com.javabom.sample.magicnumber.asis;

public class Noise {
    private final double decibel;

    public Noise(double decibel) {
        validate(decibel);
        this.decibel = decibel;
    }

    private void validate(double decibel) {
        if (decibel < 10.0) {
            throw new IllegalArgumentException();
        }
    }
}
