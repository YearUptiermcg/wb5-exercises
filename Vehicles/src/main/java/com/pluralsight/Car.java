package com.pluralsight;

public class Car extends Vehicle {

    private String trunkContents;
    private String airFreshenerType;


    // Constructor for Car
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String vehicleType, boolean isGasoline, boolean isElectric, boolean isManual, float speedCurrent, float speedMax, String trunkContents, String airFreshenerType) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, vehicleType, isGasoline, isElectric, isManual, speedCurrent, speedMax);
        this.trunkContents = trunkContents;
        this.airFreshenerType = airFreshenerType;
    }

    // Getters and setters for Car-specific fields
    public String getTrunkContents() {
        return trunkContents;
    }

    public void setTrunkContents(String trunkContents) {
        this.trunkContents = trunkContents;
    }

    public String getAirFreshenerType() {
        return airFreshenerType;
    }

    public void setAirFreshenerType(String airFreshenerType) {
        this.airFreshenerType = airFreshenerType;
    }
}
