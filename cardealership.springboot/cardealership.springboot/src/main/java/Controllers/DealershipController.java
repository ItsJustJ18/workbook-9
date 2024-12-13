package Controllers;


import com.springboot.cardealership.springboot.classes.Dealership;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/dealership")
public class DealershipController {

    @GetMapping
    public List<Dealership> findAllDealerships() {
        List<Dealership> resultsFound = new ArrayList<>();
        resultsFound.add(new Dealership(1, "D & B Used Cars", "111 Old Benbrook Rd", "813-584-0931"));
        resultsFound.add(new Dealership(2, "Transformers Battle", "6573 CyberTron Town", "576-435-0741"));
        resultsFound.add(new Dealership(3, "Crazy Cars", "3456 Super Crazy Rd", "000-546-9045"));
        return resultsFound;
    }


}
