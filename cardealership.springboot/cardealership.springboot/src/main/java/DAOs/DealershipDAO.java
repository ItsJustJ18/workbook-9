package DAOs;

import com.springboot.cardealership.springboot.classes.Dealership;

import java.util.List;

public interface DealershipDAO {

    List<Dealership> findAllDealerships();

}
