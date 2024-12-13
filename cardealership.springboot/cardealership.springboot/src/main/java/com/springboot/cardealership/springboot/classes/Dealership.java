package com.springboot.cardealership.springboot.classes;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private int dealershipId;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> storage;

    public Dealership(int dealershipId, String name, String address, String phone) {
        this.dealershipId = dealershipId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.storage = new ArrayList<>();
    }

    public Dealership() {

    }

    public int getDealershipId() {
        return dealershipId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<Vehicle> getAllVehicles() {
        return storage;
    }

    public void addVehicle(Vehicle vehicle) {
        storage.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        storage.remove(vehicle);
    }
}
