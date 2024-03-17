package hiber.service;

import hiber.models.Car;

import java.util.List;

public interface CarServiceInterface {

   void addCar(Car car);

   Integer recieveQuantityOfCars(List<Car> listCars);

}
