package Controllers;

import com.springboot.cardealership.springboot.classes.Vehicle;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class VehicleController {

    @GetMapping("/search")
    public List<Vehicle> searchingForVehicle() {


    }

}
