package DAOs;

import com.springboot.cardealership.springboot.classes.SalesContract;
import com.springboot.cardealership.springboot.classes.Vehicle;

import java.util.ArrayList;

public interface SalesContractDAO {


ArrayList<Vehicle> getVehicleSold();
ArrayList<SalesContract> findAllSalesContracts(SalesContract salesContract);

}
