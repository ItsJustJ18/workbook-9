package com.springboot.cardealership.springboot.classes;

import DAOs.SalesContractDAO;

import java.time.LocalDate;

public class SalesContract {

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
    private double odometer;
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean isFinanced;
    private double monthlyPayment;
    private double totalPrice;

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

    protected double calculateMonthlyPayment(double principal, double annualInterestRate, int months) {

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        if (monthlyInterestRate == 0) {
            return principal / months;
        } else {
            return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months)) /
                    (Math.pow(1 + monthlyInterestRate, months) - 1);

            @Override
            public double getMonthlyPayment() {
                if (getTotalPrice() >= 10000 && getFinance()) {
                    this.monthlyPayment = calculateMonthlyPayment(getTotalPrice(), 4.25, 48);
                    System.out.println(" For 48 months your loan is" + getMonthlyPayment());
                } else if (getTotalPrice() <= 10000 && getFinance()) {
                    this.monthlyPayment = calculateMonthlyPayment(getTotalPrice(), 5.25, 24);
                }
                return this.monthlyPayment;
            }
            @Override
            public double getTotalPrice() {
                this.totalPrice = salesTax + recordingFee + processingFee + monthlyPayment;
                return totalPrice;
            }

        }
    }

    private boolean getFinance() {
        return true;
    }

    private double getTotalPrice() {
        return 0;
    }
}