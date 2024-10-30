package com.pluralsight;

public class Moped extends Vehicle {
    private String underseatStorage;

    // Constructor for Moped
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String underseatStorage) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.underseatStorage = underseatStorage;
    }

    // Getter and setter for underseatStorage
    public String getUnderseatStorage() {
        return underseatStorage;
    }

    public void setUnderseatStorage(String underseatStorage) {
        this.underseatStorage = underseatStorage;
    }
}
