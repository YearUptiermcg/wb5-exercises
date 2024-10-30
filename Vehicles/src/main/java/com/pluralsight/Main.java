package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        // Initialize Hovercraft with parameters
        Hovercraft vehicle1 = new Hovercraft(
                "Blue", 6, 500, 100, "Hovercraft", false, true, false,
                15.0f, 40.0f, true, 2.0f
        );

        // Initialize SemiTruck with parameters
        SemiTruck vehicle2 = new SemiTruck(
                "Red", 2, 3000, 300, "SemiTruck", true, false, true,
                10.0f, 80.0f, "Furniture", 5000.0f, true
        );

        System.out.println(vehicle1);
        System.out.println(vehicle2);
    }
}
