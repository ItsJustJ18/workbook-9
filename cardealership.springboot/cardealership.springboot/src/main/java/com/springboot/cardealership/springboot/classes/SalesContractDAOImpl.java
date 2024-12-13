package com.springboot.cardealership.springboot.classes;

import DAOs.SalesContractDAO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SalesContractDAOImpl implements SalesContractDAO {

    private DataSource dataSource;

    public SalesContractDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public ArrayList<SalesContract> findAllSalesContract() {

        public ArrayList<SalesContract> findAllSalesContract() {
            ArrayList<SalesContract> salesContracts = new ArrayList<>();

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

            try (Connection connection = dataSource.getConnection()) {
                PreparedStatement statement = connection.prepareStatement("""
                        SELECT * FROM sales_contract;
                        """);

                statement.setString(1, contractType = "Sales");
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    contractId = resultSet.getInt("contract_id");
                    contractType = resultSet.getString("contract_type");
                    contractDate = resultSet.getDate("contract_date").toLocalDate();
                    customerName = resultSet.getString("customerName");
                    customerEmail = resultSet.getString("customerEmail");
                    vin = resultSet.getInt("vin");
                    year = resultSet.getInt("year");
                    make = resultSet.getString("make");
                    model = resultSet.getString("model");
                    vehicleType = resultSet.getString("vehicle_Type");
                    color = resultSet.getString("color");
                    odometer = resultSet.getDouble("odometer");
                    salesTax = resultSet.getDouble("sales_tax");
                    recordingFee = resultSet.getDouble("recording_fee");
                    processingFee = resultSet.getDouble("processing_fee");
                    isFinanced = resultSet.getBoolean("finance");
                    monthlyPayment = resultSet.getDouble("monthly_payment");

                    SalesContract salesContract = new SalesContract(contractId, contractType, contractDate, customerName, customerEmail, vin, year, make, model, vehicleType, color, odometer,salesTax, recordingFee, processingFee, isFinanced, monthlyPayment);
                    findAllSalesContracts(salesContract);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return salesContracts;
        }
    }

    @Override
    public ArrayList<SalesContract> findAllSalesContracts(SalesContract salesContract) {
        return null;
    }

    public List<SalesContract> saveTheSalesContract() {
        List<SalesContract> salesContracts = new ArrayList<>();
        int contractId = 0;
        String contractType = " ";
        LocalDate contractDate = LocalDate.EPOCH;
        String customerName = " ";
        String customerEmail = " ";
        int vin = 0;
        int year = 0;
        String make = " ";
        String model = " ";
        String vehicleType = " ";
        String color = " ";
        double odometer = 0;
        double salesTax = 0;
        double recordingFee = 0;
        double processingFee = 0;
        boolean isFinanced = false;
        double monthlyPayment = 0;

        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("""
                    INSERT INTO sales_contract VALUES (?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
                    """);

            statement.setInt(1, contractId);
            statement.setString(2, contractType);
            statement.setString(3, String.valueOf(contractDate));
            statement.setString(4, customerName);
            statement.setString(5, customerEmail);
            statement.setInt(6, vin);
            statement.setInt(7, year);
            statement.setString(8, make);
            statement.setString(9, model);
            statement.setString(10, vehicleType);
            statement.setString(11, color);
            statement.setDouble(12, odometer);
            statement.setDouble(13, salesTax);
            statement.setDouble(14, recordingFee);
            statement.setDouble(15, processingFee);
            statement.setBoolean(16, isFinanced);
            statement.setDouble(17, monthlyPayment);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return salesContracts;
    }

}