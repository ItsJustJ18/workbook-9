package Controllers;


import com.springboot.cardealership.springboot.classes.Dealership;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Dealership addDealership(@RequestBody Dealership dealership) {
        System.out.println(dealership);
        return dealership;
    }

    @DeleteMapping
    @RequestMapping(path = "/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable ("id") int dealershipId) {
        System.out.println("Deleted dealership ID" + dealershipId);

    }
}
