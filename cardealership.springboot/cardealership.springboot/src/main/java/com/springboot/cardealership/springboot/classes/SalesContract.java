package com.springboot.cardealership.springboot.classes;

import java.time.LocalDate;

public class SalesContract {

    int contractId;
    String contractType;
    LocalDate contractDate;
    String customerName;
    String customerEmail;
    int vin;
    int year;
    String make;
    String model;
    String vehicleType;
    String color;
    double odometer;
    double salesTax;
    double recordingFee;
    double processingFee;
    boolean isFinanced;
    double monthlyPayment;

    public SalesContract(int contractId, String contractType, LocalDate contractDate, String customerName, String customerEmail, int vin, int year, String make, String model, String vehicleType, String color, double odometer, double salesTax, double recordingFee, double processingFee, boolean isFinanced, double monthlyPayment) {
        this.contractId = contractId;
        this.contractType = contractType;
        this.contractDate = contractDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.isFinanced = isFinanced;
        this.monthlyPayment = monthlyPayment;
    }

    public SalesContract() {

    }

    public int getContractId() {
        return contractId;
    }

    public String getContractType() {
        return contractType;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public double getOdometer() {
        return odometer;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
