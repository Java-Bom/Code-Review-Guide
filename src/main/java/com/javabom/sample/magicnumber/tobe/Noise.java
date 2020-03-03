package com.javabom.sample.magicnumber.tobe;

public class Noise {
    private static final double BREATH_NOISE = 10.0;

    private final double decibel;

    public Noise(double decibel) {
        validate(decibel);
        this.decibel = decibel;
    }

    private void validate(double decibel) {
        if (decibel < BREATH_NOISE) {
            throw new IllegalArgumentException();
        }
    }
}
