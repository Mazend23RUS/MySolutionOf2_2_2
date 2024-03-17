package hiber.service;

import hiber.DAO.ImpCarDAO;
import hiber.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Service
public class ImpCarService implements CarServiceInterface {
    private Car car;
    @Autowired
    private ImpCarDAO impCarDAO;

    @Override
    @Transactional
    public void addCar(Car car) {impCarDAO.addCar(car);
    }
    @Transactional
    @Override
    public Integer recieveQuantityOfCars(List<Car> listCars) {
        return impCarDAO.recieveQuantityOfCars(listCars);
    }
}

