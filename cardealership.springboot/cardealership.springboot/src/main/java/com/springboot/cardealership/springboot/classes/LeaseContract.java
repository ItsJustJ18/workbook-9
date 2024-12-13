package com.springboot.cardealership.springboot.classes;

import DAOs.LeaseContractDAO;

import java.time.LocalDate;

public class LeaseContract {

    private int contractId;
    private String contractType;
    private LocalDate contractDate;
    private String customerName;
    private String customerEmail;
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private double odometer, endingValue, totalPrice, leaseFee, leaseMonthlyPayment;


    public LeaseContract(int contractId, String contractType, LocalDate contractDate, String customerName, String customerEmail, int vin, int year, String make, String model, String vehicleType, String color, double odometer, double endingValue, double totalPrice, double leaseFee, double leaseMonthlyPayment) {
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
        this.endingValue = endingValue;
        this.totalPrice = totalPrice;
        this.leaseFee = leaseFee;
        this.leaseMonthlyPayment = leaseMonthlyPayment;
    }

    public LeaseContract() {

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

    public double getEndingValue() {
        return endingValue;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public double getLeaseMonthlyPayment() {
        return leaseMonthlyPayment;
    }

    protected double calculateMonthlyPayment(double principal, double annualInterestRate, int months) {

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        if (monthlyInterestRate == 0) {
            return principal / months;
        } else {
            return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months)) /
                    (Math.pow(1 + monthlyInterestRate, months) - 1);
        }

        public double getMonthlyPayment() {
            this.leaseMonthlyPayment = calculateMonthlyPayment(getTotalPrice(), 4.0, 36);
            return this.leaseMonthlyPayment;
        }

        public double getTotalPrice() {
            this.totalPrice = endingValue + leaseFee + leaseMonthlyPayment;
            return totalPrice;
        }

    }

}



