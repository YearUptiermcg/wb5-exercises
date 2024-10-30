package com.pluralsight;

public class Hovercraft extends Vehicle {
    private boolean onWater;
    private float hoverHeight;

    // Constructor for Hovercraft
    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, boolean onWater, float hoverHeight) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.onWater = onWater;
        this.hoverHeight = hoverHeight;
    }



    // Getters and setters for Hovercraft-specific fields
    public boolean isOnWater() {
        return onWater;
    }

    public void setOnWater(boolean onWater) {
        this.onWater = onWater;
    }

    public float getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(float hoverHeight) {
        this.hoverHeight = hoverHeight;
    }
}
