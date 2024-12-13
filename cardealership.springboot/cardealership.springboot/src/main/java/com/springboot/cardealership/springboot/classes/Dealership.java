package com.springboot.cardealership.springboot.classes;

public class Dealership {

    private int dealershipId;
    private String name;
    private String address;
    private String phone;

    public Dealership(int dealershipId, String name, String address, String phone) {
        this.dealershipId = dealershipId;
        this.name = name;
        this.address = address;
        this.phone = phone;
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
}
