package hiber.DAO;

import hiber.models.Car;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CarDAO {

    void addCar(Car car);

    Integer recieveQuantityOfCars(List<Car> listCars);
}
