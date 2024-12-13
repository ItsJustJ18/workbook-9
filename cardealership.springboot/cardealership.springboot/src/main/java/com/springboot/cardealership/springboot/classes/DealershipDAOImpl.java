package com.springboot.cardealership.springboot.classes;

import DAOs.DealershipDAO;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class DealershipDAOImpl implements DealershipDAO {

    private DataSource dataSource;

    public DealershipDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void findDealershipById(int id) {

    }

    public List<Dealership> getAllDealerships() {
        List<Dealership> dealerships = new ArrayList<>();


    }
}
